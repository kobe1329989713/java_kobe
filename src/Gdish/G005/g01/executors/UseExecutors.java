package Gdish.G005.g01.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/01/22/ 20:20 星期一<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class UseExecutors {
    public static void main(String[] args) {

        /**
         * 这几种创建线程池 都是 ThreadPoolExecutor 类  给它的构造赋值不同的而已。
         *  工厂方法。
         *
         *  LinkedBlockingQueue() 一个无界队列。
         * SynchronousQueue() 阻塞队列。没有容量队列。
         * DelayedWorkQueue() 带有延迟的队列。可以做定时功能。
         */

        // 创建了10个线程。
//        ExecutorService pool = Executors.newFixedThreadPool(10);
        // 只创建一个线程。
//        ExecutorService pool = Executors.newSingleThreadExecutor();
        // 创建一个没有容量限制的线程池。带有缓存线程池。
//        ExecutorService pool = Executors.newCachedThreadPool();
        // 和 newFixedThreadPool() 有点样，创建固定数量的线程池。
        ExecutorService pool = Executors.newScheduledThreadPool(10);



    }
}
