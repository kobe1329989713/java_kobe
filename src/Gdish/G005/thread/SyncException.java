package Gdish.G005.thread;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/01/24/ 23:22 星期三<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>synchronized 异常时。<BR>
 */
public class SyncException {
    private int i = 0;


    //
    public synchronized void operation() {
        while (true) {
            i++;
            try {
                Thread.sleep(200);
                System.out.println(Thread.currentThread().getName() + ", i = " + i);
                if (i == 10) {
                    // 这里面就会出现一个转换异常。
                    Integer.parseInt("a");
                }
            } catch (Exception e) {
                e.printStackTrace();
                // 在 synchronized 出现异常时  必须要记录日志。继续往下执行    下面几个处理方案。
                System.out.println("log info i=" + i);
                // 或者 抛出异常。
                // throw new RuntimeException
                // 或者 结束循环。
                // continue;
            }
        }
    }

    public static void main(String[] args) {
        final SyncException se = new SyncException();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                se.operation();
            }
        },"t1");
        t1.start();
    }
}
