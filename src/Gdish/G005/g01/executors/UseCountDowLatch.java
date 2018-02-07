package Gdish.G005.g01.executors;


import java.util.concurrent.CountDownLatch;

/**
 *  并发包下的 ConntDownLatch 工具类的使用。
 */
public class UseCountDowLatch {
    public static void main(String[] args) {

        /**
         *
         CountDownLatch
         这个类 有点类似于 线程 wait() 和 notify() 这两个方法的 增加版本。
         注：
         它后面 参数 2 的意思是：必须要调用再次 countDown() 通知
         它都会继续往后面执行（才不会阻塞在哪里。）

         应用场景：在 zk 时，
         */
        final CountDownLatch countDown = new CountDownLatch(2);

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("进入线程t1 "+"等待其它线程处理完成");
                try {
                    // await() 等待着，程序就阻塞在这里面。
                    countDown.await();
                    System.out.println("t1线程继续执行。");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"t1");


        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t2线程进行初始化操作");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("t2线程初始化完毕，通知t1线程继续。。");
                // countDown() 通知。
                countDown.countDown();
            }
        }, "t2");


        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t3线程进行初始化操作");
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("t3线程初始化完毕，通知t1线程继续。。");
                countDown.countDown();
            }
        }, "t2");


        t1.start();
        t2.start();
        t3.start();
    }
}
