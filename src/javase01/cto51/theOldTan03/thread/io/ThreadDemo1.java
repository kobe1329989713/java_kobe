package javase01.cto51.theOldTan03.thread.io;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/01/18/ 21:11 星期四<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>四个创建线程调用的方式。
 *      传递参数到线程里面。
 *
 *      join() 线程的串行化，
 *          就是一个线程在运行过程中 需要 等待另一个线程的执行结果，就叫：串行化。
 *
 * <BR>
 */
class Thread1 extends Thread {

    private int num;

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.println("得到当前线程名字："+Thread.currentThread().getName());
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread: " + i + "，传递进来的参数是：" + num);
        }
    }
}

// 222222222222
class Thread2 implements Runnable {
    private int num;
    // 使用构造方法往线程里面传递参数。
    public Thread2(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.println("Runnable 方式获取当前线程名字："+Thread.currentThread().getName());
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Runnable: " + i + "，// 使用构造方法往线程里面传递参数。" + num);
        }
    }
}


public class ThreadDemo1 {
    public static void main(String[] args) throws Exception {
        Thread1 t1 = new Thread1();
        // 设置线程优先级。但是不要直接给10 要用 Thread 里面的 哪几个常量
//        t1.setPriority(1);
        // 数据越大 优先级级别越高。
        t1.setPriority(Thread.MAX_PRIORITY);
        System.out.println("获取线程的优先级："+t1.getPriority());
        // 往 t1 这个线程传递参数进去。
        t1.setNum(25);
        // 设置线程的名字。
        t1.setName("// 设置线程的名字。");
        t1.start();

        // 要线程有 顺序的执行。
        t1.join();
        // 线程休眠 sleep()，不释放锁的，wait() 释放锁。


        //
        Runnable r2 = new Thread2(30);
        Thread t3 = new Thread(r2,"这里面就是设置线程名字");
        t3.start();
        // 同上。在等待的这个时间内，它又可能又去执行其它线程了。
        t3.join(1000);

        new Thread(()->{
            for (int i = 0; i < 20; i++) {
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Lambda: " + i);
            }
        }).start();


        for (int i = 0; i < 20; i++) {
            Thread.sleep(500);
            System.out.println("main: " + i);
        }



        // 方法引用。
        new Thread(ThreadDemo1::print).start();

    }

    static void print() {
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("print: " + i);
        }
    }

}
