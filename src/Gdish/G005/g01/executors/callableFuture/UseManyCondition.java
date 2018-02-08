package Gdish.G005.g01.executors.callableFuture;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/02/08/ 0:06 星期四<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>多个线程之间交互，使用 Condition 比较灵活。<BR>
 */
@SuppressWarnings("ALL")
public class UseManyCondition {

    // tair 非公平锁(按照CPU的时间片段来加锁。随机加锁)。false 公平锁(排除加锁样，哪个代码先调用，就加它的锁。)。默认为false.
    // 不加参数就是 非公平锁，它的效率高。
    private ReentrantLock lock1 = new ReentrantLock(true);

    private ReentrantLock lock = new ReentrantLock();
    private Condition c1 = lock.newCondition();
    private Condition c2 = lock.newCondition();

    public void m1() {
        try {
            lock.lock();
            System.out.println("当前线程："+Thread.currentThread().getName()+"进入到m1方法等待。。");
            c1.await();
            System.out.println("当前线程："+Thread.currentThread().getName()+"进入到m1方法继续。。");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }


    public void m2() {
        try {
            lock.lock();
            System.out.println("当前线程："+Thread.currentThread().getName()+"进入到m2方法等待。。");
            c1.await();
            System.out.println("当前线程："+Thread.currentThread().getName()+"进入到m2方法继续。。");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public void m3() {
        try {
            lock.lock();
            System.out.println("当前线程："+Thread.currentThread().getName()+"进入到m3方法等待。。");
            // 注：是 c2 的Condition 了。
            c2.await();
            System.out.println("当前线程："+Thread.currentThread().getName()+"进入到m3方法继续。。");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public void m4() {
        try {
            lock.lock();
            System.out.println("当前线程："+Thread.currentThread().getName()+"唤醒..");
            // m3 它唤醒不了，因为 m3 是 c2 的Condition
            c1.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public void m5() {
        try {
            lock.lock();
            System.out.println("当前线程："+Thread.currentThread().getName()+"唤醒。。。");
            // 这里面唤醒 m3
            c2.signal();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {

        final UseManyCondition umc = new UseManyCondition();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                umc.m1();
            }
        },"t1");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                umc.m2();
            }
        },"t2");


        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                umc.m3();
            }
        },"t3");


        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                umc.m4();
            }
        },"t4");


        Thread t5 = new Thread(new Runnable() {
            @Override
            public void run() {
                umc.m5();
            }
        },"t5");

        // c1
        t1.start();
        // c1
        t2.start();
        // c2
        t3.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        // c1
        t4.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // c2
        t5.start();
    }
}
