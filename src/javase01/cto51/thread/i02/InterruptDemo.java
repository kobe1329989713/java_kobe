package javase01.cto51.thread.i02;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/01/18/ 22:18 星期四<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>
 *
 *      34  还可以在看。
 *      线程停止不能使用 stop() 方法。
 *
 * <BR>
 */
public class InterruptDemo {
    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();


        for (int i = 0; i < 20; i++) {
            System.out.println("Main" + i);
            Thread.sleep(300);
        }
        // 中断线程。只是发一个请求告诉线程你可以中断了，但是线程是否中断不一定了。
        t1.interrupt();
        // 如果发了中断请求，它就是一个true，就是线程的一个标识位
        System.out.println("// 如果发了中断请求，它就是一个:  " + t1.isInterrupted());
        System.out.println("它会重置标识位 :  " + t1.isInterrupted());

    }
}
