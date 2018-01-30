package Gdish.G005.thread;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/01/25/ 0:27 星期四<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>valotile 关键字<BR>
 */
public class RunThread extends Thread {

    // *******  被 volatile 关键字修饰的变量 只要发生变化了，它会时时的刷新进 线程的内存空间里面。
    // volatile 关键字只具备可见性 不具备 原子必。
    private volatile boolean isRunning = true;

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    @Override
    public void run() {
        System.out.println("进入run() 方法。。");
        while (isRunning == true) {
            //
        }
        System.out.println("线程停止。");
    }

    public static void main(String[] args) throws InterruptedException {
        RunThread rt = new RunThread();
        rt.start();
        Thread.sleep(3000);
        // 你虽然把 isRunning 设置成了 false 但是线程还是没有停止，因为 isRunning 对其它线程是不可以见的，你设置成了false 但是线程不知道
        // 所以要加 volatile 关键字就行了。
        rt.setRunning(false);
        System.out.println("isRunning 的值已经被设置了 false");
        Thread.sleep(1000);
        System.out.println(rt.isRunning);
    }
}
