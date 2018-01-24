package Gdish.G005.thread;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/01/22/ 21:47 星期一<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class MyThread extends Thread {
    private int count = 5;

    public synchronized void run() {
        count--;
        System.out.println(this.currentThread().getName() + " count = " + count);
    }


    public static void main(String[] args) {
        /**
         * 分析： 当多个线程访问MyThread 的 run() 方法时，以排队的方式进行处理(这里排队是按照 CPU 分配的先后顺序而定的)，
         *      一个线程想要执行 synchronized 修饰的方法里的代码。步骤如下：
         *      1。尝试获得锁。
         *      2。如果拿到锁，执行 synchronized 代码体内容：拿不到锁，这个线程就会不断尝试获得锁，直到拿到锁为止。
         *      而已是多个线程同时去竟争这把锁，（也就是会有锁竟争问题）
         *
         *      锁竟争问题: 是一个非常严重的bug 问题，这里面只有5个线程，假如有 1000 个，当其中一个线程 释放完锁后，其它999 个线程
         *      同时都去抢这一把锁，你的 cpu 会马上 飙到100% 去，整不好服务器就当机了。
         *      所以就要有 线程池 队列 等其它一些资源。
         *
         *
         */
        MyThread myThread = new MyThread();
        Thread t1 = new Thread(myThread, "t1");
        Thread t2 = new Thread(myThread, "t2");
        Thread t3 = new Thread(myThread, "t3");
        Thread t4 = new Thread(myThread, "t4");
        Thread t5 = new Thread(myThread, "t5");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
