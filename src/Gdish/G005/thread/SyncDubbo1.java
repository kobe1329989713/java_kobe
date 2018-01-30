package Gdish.G005.thread;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/01/24/ 23:06 星期三<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>重入锁。2<BR>
 */
public class SyncDubbo1 {

    // 都同步了。锁重入 问题。
    public synchronized void method1() {
        System.out.println("method1..");
        method2();
    }

    private synchronized void method2() {
        System.out.println("method2..");
        method3();
    }

    private synchronized void method3() {
        System.out.println("method3..");
    }

    public static void main(String[] args) {
        final SyncDubbo1 sd = new SyncDubbo1();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                sd.method1();
            }
        });
        t1.start();
    }
}
