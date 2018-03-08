package javase01.cto51.theOldTan03.thread.i02.i03;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/01/18/ 23:09 星期四<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
@SuppressWarnings("ALL")
public class SynchronizedDemo {
    public static void main(String[] args) {
        SynchronizedDemo s = new SynchronizedDemo();
        new Thread(s::m1).start();
        new Thread(s::m2).start();
    }

    public synchronized void m1() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("A: "+i);
        }
    }
    // 两个方法都加上 synchronized 关键字 就是同步的。 你把这两个方法的 synchronied 关键字去掉试试。
    public synchronized void m2() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("B: " + i);
        }
    }
}
