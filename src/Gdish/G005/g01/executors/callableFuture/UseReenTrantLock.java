package Gdish.G005.g01.executors.callableFuture;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/02/07/ 23:32 星期三<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>:UseReenTrantLock: 重入锁。<BR>
 */
@SuppressWarnings("ALL")
public class UseReenTrantLock {

    private Lock lock = new ReentrantLock();

    // 之前是在方法上加 synchronized 现在只是 换成调用方法而已。
    public void method1() {
        // 加锁。
        // 使用了 lock 就必须要使用 finally{} 它们一起使用。jdk低层代码 都是这样做的。
        lock.lock();

        System.out.println("当前线程："+Thread.currentThread().getName()+"进入 method1()");
        try {
            Thread.sleep(1000);
            System.out.println("当前线程："+Thread.currentThread().getName()+"退出。method1()");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            // 释放锁。
            lock.unlock();
        }

    }

    public void method2() {
        // 加锁。必须要等 t1 释放锁了，method2() 方法才能执行。
        lock.lock();

        System.out.println("当前线程："+Thread.currentThread().getName()+"进入method2()");
        try {
            Thread.sleep(2000);
            System.out.println("当前线程："+Thread.currentThread().getName()+"退出。method2()");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            // 释放锁。
            lock.unlock();
        }

    }


    public static void main(String[] args) {

        // 以前怎么使用 synchronized 关键字的 就如何使用ReentrantLock 类。
        // ReentrantLock 和 synchronized 两个区别： 在jdk8 之前的 lock 性能比 synchronized 要好，jdk8之后的两个都差不多的。
        // lock 比 synchronized 要灵活些。

        // 当前这个类。
        final UseReenTrantLock ur = new UseReenTrantLock();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                ur.method1();
                ur.method2();
            }
        },"t1");
        t1.start();

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        System.out.println(ur.lock.);
    }



}
