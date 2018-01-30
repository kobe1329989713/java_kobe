package Gdish.G005.thread;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/01/24/ 23:50 星期三<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>
 *      synchronized 代码块对字符串的锁，注意String 常量池的缓存功能。
 *
 * <BR>
 */
public class StringLock {
    public void method() {
        // 尽量不要用一个 字符串常量的方式来加锁， 可以用 new String("字符串常量"); 这种方式了
        // 因为字符串常量的方式：它的引用始终只有一个了。
        synchronized (new String("字符串常量")) {
            while (true) {
                System.out.println("当前线程："+Thread.currentThread().getName()+"开始。");
                try {
                    Thread.sleep(1000);
                    System.out.println("当前线程："+Thread.currentThread().getName()+"结束");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        final StringLock stringLock = new StringLock();
        // 两个线程。
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                stringLock.method();
            }
        },"t1");
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                stringLock.method();
            }
        },"t2");
        t1.start();
        t2.start();
    }
}
