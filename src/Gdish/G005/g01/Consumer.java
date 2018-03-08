package Gdish.G005.g01;

import java.util.Random;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/01/22/ 19:41 星期一<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>消费者。<BR>
 */
public class Consumer implements Runnable {

//    private BlockingQueue<Data> queue;

//    public Consumer(BlockingQueue<Data> queue) {
//        this.queue = queue;
//    }

    // 随机对象。
    private static Random r = new Random();

    @Override
    public void run() {
//        while (true) {
//            try {
//                // 获取数据。
//                Data data = this.queue.take();
//                // 模拟消耗的时间。
//                Thread.sleep(r.nextInt(1000));
//                System.out.println("当前消费线程：" + Thread.currentThread().getName() + "，消费成功，消息数据国：" + data.getId());
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
    }
}
