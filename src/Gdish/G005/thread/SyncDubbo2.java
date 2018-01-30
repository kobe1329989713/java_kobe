package Gdish.G005.thread;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/01/24/ 23:11 星期三<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>也是 锁重入 问题。<BR>
 */
public class SyncDubbo2 {

    // 这样 父子类 也是同步。线程安全的。
    // 要做到同步所有的东东都必须加 synchronized 修饰才行。

    static class Main{
        public int i = 10;

        public synchronized void operationSup() {
            i--;
            System.out.println("Main print i = " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class Sub extends Main {
        public synchronized void operationSub() {
            while (i > 0) {
                System.out.println("Sub print i=" + i);
                try {
                    Thread.sleep(100);
                    this.operationSup();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Sub sub = new Sub();
                sub.operationSub();
            }
        });
        t1.start();
    }
}
