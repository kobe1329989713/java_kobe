package Gdish.G005.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/01/30/ 22:56 星期二<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class AtomicUse {

    private static AtomicInteger count = new AtomicInteger(0);

    // 多个 addAndGet 在一个方法内是非原子性的。需要添加 synchronized进行修饰，保证4个addAndGet整体原子性。
    public synchronized int multiAdd() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // addAndGet() 方法 真当于 +4 操作，加的步长。
        // 它只能保证 addAndGet() 这个方法调用的一次的原子性，像下面这种调用了多次的它就不能保证原子性操作了。
        // 可以在外面 加一把锁 解决这个问题。
        count.addAndGet(1);
        count.addAndGet(2);
        count.addAndGet(3);
        count.addAndGet(4);
        // addAndGet() 方法可能加起来不是等于10 ,我要的结果是addAndGet() 方法加起来等于10 的为一个原子性操作，如果不等于10 它就是不是一个原子性操作了。
        // 加起来等于10 为一个正确的操作。
        return count.get();
    }

    public static void main(String[] args) {
        final AtomicUse au = new AtomicUse();
        List<Thread> ts = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            ts.add(new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(au.multiAdd());
                }
            }));
        }
        for (Thread t : ts) {
            t.start();
        }
    }
}
