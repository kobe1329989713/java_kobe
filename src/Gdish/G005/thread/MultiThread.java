package Gdish.G005.thread;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/01/24/ 21:27 星期三<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class MultiThread {
    private static int num = 0;

    // 如果不加 synchonized , 加了 static 就是 类级别的锁，两个线程都是有顺序执行的。类锁。就像 一个类的两个对象样，它们两个是互不影响对方的。
    public static synchronized void printNum(String tag) {
        if ("a".equals(tag)) {
            num = 100;
            System.out.println("tag a, set num over");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            num = 200;
            System.out.println("tag b, set num over");
        }
        System.out.println("tag " + tag + ", num= " + num);
    }

    public static void main(String[] args) {

        final MultiThread m1 = new MultiThread();
        final MultiThread m2 = new MultiThread();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                m1.printNum("a");
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                m2.printNum("b");
            }
        });

        t1.start();
        t2.start();
    }
}
