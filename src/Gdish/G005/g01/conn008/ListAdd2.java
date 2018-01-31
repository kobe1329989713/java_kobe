package Gdish.G005.g01.conn008;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/01/30/ 23:30 星期二<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>用 wait() 和 notity() 方法 来 实现 ListAdd1 里面的代码。
 *
 *   这种方式有什么毕端：t1.notify() 时 去通知 t2 线程，但是 notify() 方法不会释放锁的， 锁还是在 t1 哪里。所以执行的还是 t1 里面的代码。它必须要等 t1 执行完毕以后 才会释放锁。才能执行t2线程。
 *   有一个不实时的问题。
 *    怎么才能实现实时的效果呢？？？？
 *    答：不要 lock 和 synchronized  如下 代码。
 *
 * <BR>
 */
public class ListAdd2 {
    private volatile static List list = new ArrayList();

    public void add() {
        list.add("bjsxt");
    }

    public int size() {
        return list.size();
    }

    public static void main(String[] args) {
        final ListAdd2 list2 = new ListAdd2();

        // 先实体化出来一个 lock 锁。
        // 当使用 wait() 和 notify() 方法时 一定要配合着 synchronized 关键字一起使用。
//        final Object lock = new Object();


        // java CountDownLatch并发包下面的的一个工具类。
        // 它就做一个实时的通知效果。
        // 如果改成 2 的话，它就不会就唤醒 t2 哪个线程。 它哪个 1 2 值 是发起第几次通知的，如果是 2 的话，你必须要调用再次 通知的方法 countDownLatch.countDown() 方法才行。
        final CountDownLatch countDownLatch = new CountDownLatch(1);

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                // 这里面相当于 获得了 lock 这一把锁了。
//                synchronized (lock) {
                    for (int i = 0; i < 10; i++) {
                        list2.add();
                        System.out.println("当前线程："+Thread.currentThread().getName()+" 添加了一个元素。。");
                        try {
                            Thread.sleep(500);
                            if (list2.size() == 5) {
                                System.out.println("已经发出通知。");
                                // 唤醒另外一边线程。 注：必须要使用同一个 lock 对象才行。
                                // notify() 方法是不释放锁的，wait() 方法释放锁。
                                // notify() 只有当前线程执行完毕以后才会释放锁。 就是只有这个 for 循环执行完毕了就会释放锁了。
//                                lock.notify();

                                // 这两个方法就是 wait() 和 notify() 方法的升级版本。它不需要和 synchronized 关键字一起使用了。
                                countDownLatch.countDown();
                            }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
//                }
            }
        },"t1");



        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
//                synchronized (lock) {
                    if (list2.size() != 5) {

                        try {
                            // 程序就等待着，就是阻塞在这里。
//                            lock.wait();

                            // 做到实时通知。
                            // await() 等待，
                            countDownLatch.await();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }
                    System.out.println("当前线程："+Thread.currentThread().getName()+"收到通知线程停止。");
                    throw new RuntimeException();
//                }
            }
        },"t2");

        // 注：先启动的是 t2 线程哦。
        t2.start();
        t1.start();


        // 看运行结果 想程序的执行流程。

    }
}
