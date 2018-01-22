package javase01.cto51.thread;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/01/18/ 20:57 星期四<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class SimplestThread {
    public static void main(String[] args) {
        // 这就是一个线程
        Thread simplestThread = new Thread();
        // 启动线程。调用start() 方法，它就会去调用 run() 方法，run() 方法执行完毕了，这个线程就执行完了。
        simplestThread.start();
        // 返回的是一个枚举。
        System.out.println("查看线程状态："+simplestThread.getState());

        // 创建一个线程组。
        ThreadGroup tg1 = new ThreadGroup("ThreadGroup");
        // 把这个线程放在线程组里面并给它起一个名字。
        Thread t1 = new Thread(tg1, "thread1");


        System.out.println("获取当前线程名字："+Thread.currentThread().getName());
    }
}
