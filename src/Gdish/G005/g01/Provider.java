package Gdish.G005.g01;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/01/22/ 19:04 星期一<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class Provider implements Runnable {

    // 共享缓存区。
    private BlockingQueue<Data> queue;
    // 多线程间是否启动变量，在强制从主内存中刷新的功能 即时返回线程的状态。
    private volatile boolean isRunning = true;

    // id生成器。
    private static AtomicInteger count = new AtomicInteger();

    // 随机对象。
    private static Random r = new Random();

    public Provider(BlockingQueue<Data> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (isRunning) {
            try {
                // 标示取数据 产生的耗时
                Thread.sleep(r.nextInt(1000));
                // 获取数据进行累计。incrementAndGet() 相当于 i++ 操作样。
                int id = count.incrementAndGet();
                Data data = new Data(Integer.toString(id), "数据“+" + id);
                System.out.println("当前线程：" + Thread.currentThread().getName() + "，数据了数据，id为：" + id + "，进行装载到公共缓存区中。。");
                // offer() add()  就和集合的 add() 方法一样就是往集合当中添加元素的。
                // 参数意思为：data 添加的对象。2 一个类似于毫秒样的东东。 TimeUnit.SECONDS 就是给2 指定一个单位的东东。  就是 在见两个秒当中添加这个元素，如果两秒钟之内没有添加成功就是返回一个false
                if (!this.queue.offer(data, 2, TimeUnit.SECONDS)) {
                    System.out.println("提交缓存区数据失败。。。");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // 停止线程方法。
    public void stop() {
        this.isRunning = false;
    }


}
