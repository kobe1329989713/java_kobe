package Gdish.G005.g01.executors.callableFuture;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/02/07/ 23:54 星期三<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>使用LOck 必须和 Condition 一起使用，Condition 就是代替 wait() 和 notify()的，就像以前使用 synchronized 关键字就必须要结合到 wait() 和notity() 样，使用 Lock 就必须要结合到 Condition 一起使用。<BR>
 */
@SuppressWarnings("ALL")
public class UseConditon {

    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void method1() {
        try {
            lock.lock();
            System.out.println("当前线程："+Thread.currentThread().getName()+"进入等待状态。。。");
            Thread.sleep(3000);
            System.out.println("当前线程："+Thread.currentThread().getName()+"释放锁。。。");
            // 它就相当于 wait() 方法样式。
            condition.await();
            System.out.println("当前线程："+Thread.currentThread().getName()+"继续执行。。");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }


    public void method2() {
        try {
            lock.lock();
            System.out.println("当前线程："+Thread.currentThread().getName()+"进入。。。");
            Thread.sleep(3000);
            System.out.println("当前线程："+Thread.currentThread().getName()+"发出唤醒。。");
            // 它就相当于是 notify() 样。
            condition.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        CopyOnWriteArrayList a = new CopyOnWriteArrayList();
        final UseConditon uc = new UseConditon();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                uc.method1();
            }
        },"t1");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                uc.method2();
            }
        },"t2");


        t1.start();
        t2.start();
    }

}
