package Gdish.G005.g01;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/01/22/ 18:55 星期一<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>
 * 
 *      生产消息者模型  中间哪一陀。
 *
 * <BR>
 */
public class Main {
    public static void main(String[] args) {
        // 一个阻塞队列。
        BlockingQueue<Data> queue = new LinkedBlockingQueue<>(10);

        // 生产者。
        Provider p1 = new Provider(queue);
        Provider p2 = new Provider(queue);
        Provider p3 = new Provider(queue);

        // 消费者。
//        Consumer c1 = new Consumer(queue);
//        Consumer c2 = new Consumer(queue);
//        Consumer c3 = new Consumer(queue);

        // 创建线程池。 带有缓存的线程池。
        ExecutorService cachePool = Executors.newCachedThreadPool();
        // 执行线程。
        cachePool.execute(p1);
        cachePool.execute(p2);
        cachePool.execute(p3);
//        cachePool.execute(c1);
//        cachePool.execute(c2);
//        cachePool.execute(c3);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        p1.stop();
        p2.stop();
        p3.stop();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
