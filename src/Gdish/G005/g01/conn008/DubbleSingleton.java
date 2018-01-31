package Gdish.G005.g01.conn008;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/01/31/ 1:16 星期三<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>懒汉单例模式 之 内部类 实现方式。<BR>
 */
public class DubbleSingleton {
    private static DubbleSingleton ds;

    public static DubbleSingleton getDs() {
        if (ds == null) {
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            // 这里面为什么还需要在判断一次了？因为 外面 哪个判断是 实例化一个线程一个线程执行的，没有任何意义，所以还需在在判断一次了。
            synchronized (DubbleSingleton.class) {
                if (ds == null) {
                    ds = new DubbleSingleton();
                }
            }
        }
        return ds;
    }




    // 测试。
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(DubbleSingleton.getDs().hashCode());
            }
        },"t1");
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(DubbleSingleton.getDs().hashCode());
            }
        },"t2");
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(DubbleSingleton.getDs().hashCode());
            }
        },"t3");
        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(DubbleSingleton.getDs().hashCode());
            }
        },"t4");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
