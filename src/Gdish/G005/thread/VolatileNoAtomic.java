package Gdish.G005.thread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/01/25/ 0:47 星期四<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>
 *
 *      volatile 关键字不具备 synchronized 关键字的原子性 就是 同步。
 *
 * <BR>
 */
public class VolatileNoAtomic extends Thread {

//    private static volatile int count;

    // 每一个线程 来 都在 ++ 操作 ，所以没有原子性（同步）
    private static AtomicInteger count = new AtomicInteger(0);

    private static void addCount() {
        for (int i = 0; i < 1000; i++) {
//            count++;
//             相当于 count++ 操作。
            count.incrementAndGet();
        }
        System.out.println(count);
    }

    @Override
    public void run() {
        addCount();
    }

    public static void main(String[] args) {
        // 就是创建10 个线程而已。
        VolatileNoAtomic[] arr = new VolatileNoAtomic[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = new VolatileNoAtomic();
        }
        for (int i = 0; i < 10; i++) {
            arr[i].start();
        }
    }
}
