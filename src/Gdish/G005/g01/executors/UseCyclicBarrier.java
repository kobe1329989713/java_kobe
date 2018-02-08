package Gdish.G005.g01.executors;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/02/07/ 21:10 星期三<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>CyclicBarrier 发命员的意思。
 *
 *
 *      fork / join 51cto 上面必须要看，这是一个属于基础知识的。
 *
 * <BR>
 */
public class UseCyclicBarrier {

    static class Runner implements Runnable {

        private CyclicBarrier barrier;
        private String name;

        public Runner(CyclicBarrier barrier, String name) {
            this.barrier = barrier;
            this.name = name;
        }

        @Override
        public void run() {
            try {
                Thread.sleep(1000 * (new Random()).nextInt(5));
                System.out.println(name + "准备OK");
                // await() 等待, 等几个线程都准备好了，就可以开始执行。
                barrier.await();
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(name+" GO!");
        }
    }


    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(3);
        ExecutorService executor = Executors.newFixedThreadPool(3);
        // CyclicBarrier 大概意思就是 一发命令，三个运动员一起就开跑。理解成线程。
        // 三个运行员，就是三个线程，当这三个线程全部准备好了，才开始执行了。
        // 为什么是3 了，就是CyclicBarrier()构造哪里传的值。
        executor.execute(new Thread(new Runner(barrier,"kobe01")));
        executor.execute(new Thread(new Runner(barrier,"kobe02")));
        executor.execute(new Thread(new Runner(barrier,"kobe03")));
        executor.shutdown();
    }





}
