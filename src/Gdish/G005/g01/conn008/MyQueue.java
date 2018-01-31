package Gdish.G005.g01.conn008;

import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/01/31/ 0:21 星期三<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>模拟 Queue<BR>
 */
public class MyQueue {
    // 1.需要一个集合来装载元素。
    private final LinkedList<Object> list = new LinkedList<>();

    // 2.设置上界。 需要一个计数器。往list 加一个元素就自增下。
    private AtomicInteger count = new AtomicInteger(0);

    // 3.需要指定上限和下限
    private final int minSize = 0;
    // 在你使用这个队列时 指定。
    private final int maxSize;

    public MyQueue(int size) {
        this.maxSize = size;
    }

    // 初始化一个对象用于加锁。
    private Object lock = new Object();


    // 模拟 put() 和 take() 方法。
    public void put(Object obj) {
        synchronized (lock) {
            while (count.get() == this.maxSize) {
                // 如果进来就表示 你的队列里面已经满了。
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            // 加入元素
            list.add(obj);
            // i++ 计数器累加。
            count.incrementAndGet();
            // 加入元素 必须要通知另外的一个线程 已经有数据了。唤醒操作。
            lock.notify();
            System.out.println("新加入元素为：" + obj);
        }
    }

    public Object take() {
        Object ret = null;
        synchronized (lock) {
            while (count.get() == this.minSize) {
                // 如果进来 就是队列 里面没有数据，就阻塞在这里面。
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            // 移除当前list 里面的第一个元素。
            // 为什么移除了？？ 因为获取的时候直接从 list 哪个集合里面获取和这里面的代码，没有关系它只是一个装载的窗口而已。而哪个移除的元素返回给你了。所以你就获取到了一个元素了。
            ret = list.removeFirst();
            // i--
            count.decrementAndGet();
            // 唤醒另外一个线程。
            lock.notify();
        }
        return ret;
    }

    public int getSize() {
        return this.count.get();
    }
    public static void main(String[] args) {
        final MyQueue mq = new MyQueue(5);
        mq.put("a");
        mq.put("b");
        mq.put("c");
        mq.put("d");
        mq.put("e");
        System.out.println("当前容器长度：: " + mq.getSize());


        // 你直接这样 在后面调用 .start() 方法会报错的。如下就不会。
//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                mq.put("f");
//                mq.put("g");
//            }
//        }).start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                mq.put("f");
                mq.put("g");
            }
        },"t1").start();


        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Object o1 = mq.take();
                System.out.println("移除元素为：" + o1);
                Object o2 = mq.take();
                System.out.println("移除元素为：" + o2);
            }
        },"t2");

        // 休眠 两秒 后在启动 t2 线程。
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();
    }
}
