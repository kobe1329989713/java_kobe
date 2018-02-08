package Gdish.G005.g01.executors.callableFuture;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/02/07/ 22:54 星期三<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>信号量
 *
 * <BR>
 */
public class UseSemaphore {
    public static void main(String[] args) {
        // 线程池。 是一个没有容量限制的 线程池。
        ExecutorService exec = Executors.newCachedThreadPool();
        // 实例一个信号量对象： 只能5个线程同时访问。
        final Semaphore semp = new Semaphore(5);

        // 模拟20个客户端访问。
        for (int i = 0; i < 20; i++) {
            final int NO = i;
            Runnable run = new Runnable() {
                @Override
                public void run() {
                    try {
                        // 获取许可。
                        semp.acquire();
                        System.out.println("Accessing: " + NO);
                        // 模拟业务逻辑
                        Thread.sleep((long) (Math.random() * 10000));
                        // 访问它后，释放。掉这个信号量。让下一个要使用。 和锁有点类似，只不过它是一次拿到5把锁。 五个线程并行的执行。
                        semp.release();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            };
            exec.execute(run);
        }

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
         exec.shutdown();
    }
}
