package Gdish.G005.thread;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/01/24/ 23:43 星期三<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>使用 synchronized 代码块加锁，比较灵活。<BR>
 */
public class ObjectLock {

    // 对象锁。
    public void mehtod1() {
        synchronized (this) {
            System.out.println("do method1..");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    // 类锁。
    public void method2() {
        synchronized (ObjectLock.class) {
            System.out.println("do method2..");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    // 任意对象锁。
    public Object lock = new Object();
    public void method3() {
        synchronized (lock) {
            System.out.println("do method3..");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }



    public static void main(String[] args) {
        final ObjectLock objectLock = new ObjectLock();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                objectLock.mehtod1();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                objectLock.method2();
            }
        });
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                objectLock.method3();
            }
        });
        t1.start();
        t2.start();
        t3.start();
    }
}
