package javase01.cto51.thread.i02;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/01/18/ 22:29 星期四<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>停止线程。
 *
 *      停止线程 和 中断线程 是 两个概念哦。
 *
 *
 * <BR>
 */

class Thread4 implements Runnable {

    private boolean stop = false;

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    @Override
    public void run() {
        for (int i = 0;; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (stop) {
                break;
            }
            System.out.println(i);

        }
    }
}

public class StopThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread4 t4 = new Thread4();
        Thread t = new Thread(t4);
        // 把 t 设置成守护线程  IllegalThreadStateException。报这个错误 就是你把设置成守护线程放在了 start() 的后面了
        t.setDaemon(true);
        // 如果只剩下守护线程了，哪么 jvm 也会退出掉，程序停止了。
        // 如果没有其它线程用到守护线程的服务，哪么就是只剩下守护线程了。
        t.start();


        // 这里的 Thread.sleep() 休眠的主线程的。 如果要用其它线程话，要用哪个线程的对象来调用。
        Thread.sleep(4000);
        // 就停止掉了 t4 线程了。
//        t4.setStop(true);




    }
}
