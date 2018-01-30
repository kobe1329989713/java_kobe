package Gdish.G005.thread;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/01/24/ 23:58 星期三<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>锁对象改变问题。<BR>
 */
public class ChangeLock {
    private String lock = "lock";

    private void method() {
        synchronized (lock) {
            System.out.println("当前线程："+Thread.currentThread().getName()+"开始");
            // 你已经用了一个 对象锁了 尽量不要在 线程里面修改 哪个锁对象的值。
            // 如果你一修改这个锁对象的值，这个锁就会发生变化的。
            lock = "change lock";
            try {
                Thread.sleep(2000);
                System.out.println("当前线程："+Thread.currentThread().getName()+"线束");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        final ChangeLock changeLock = new ChangeLock();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                changeLock.method();
            }
        },"t1");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                changeLock.method();
            }
        },"t2");
        t1.start();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();

        // 错误： 两个线程同时都进入到 method() 这个方法里面了，原因是什么 是：你修改了哪个锁，就是你改变了哪个锁对象的值。

    }
}
