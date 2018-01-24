package Gdish.G005.thread;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/01/24/ 21:45 星期三<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>
 *      对象锁的同步和迅步问题。
 * <BR>
 */
public class MyObject {
    public synchronized void method1() {
        try {
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // 如果 加了 synchronized 修饰 ，它必须要等 method1() 方法执行完了才会执行 method2  同步的。 去掉它就可以并发的访问了。异步的。
    public  void method2() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {

        final MyObject mo = new MyObject();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                mo.method1();
            }
        },"t1");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                mo.method2();
            }
        },"t2");

        t1.start();
        t2.start();
    }
}
