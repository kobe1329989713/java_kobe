package Gdish.G005.g01.conn008;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/01/31/ 0:56 星期三<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>
 *      线程的局部变量问题。好像只是针对当前线程可见。
 *
 * <BR>
 */
public class ConnThreadLocal {
    public static ThreadLocal<String> th = new ThreadLocal<>();

    public void setTh(String value) {
        th.set(value);
    }

    public void getTh() {
        System.out.println(Thread.currentThread().getName() + "：" + this.th.get());
    }

    public static void main(String[] args) {
        final ConnThreadLocal ct = new ConnThreadLocal();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                ct.setTh("张三");
                ct.getTh();
            }
        },"t1");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                    ct.getTh();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"t2");


        t1.start();
        t2.start();
    }

}
