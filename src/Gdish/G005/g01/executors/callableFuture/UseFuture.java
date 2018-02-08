package Gdish.G005.g01.executors.callableFuture;

import java.util.concurrent.*;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/02/07/ 21:44 星期三<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class UseFuture implements Callable<String> {

    private String para;

    public UseFuture(String queryStr) {
        this.para = queryStr;
    }

    /**
     * 这里是真实的业务逻辑，基执行可能很慢。
     * @return
     * @throws Exception
     */
    @Override
    public String call() throws Exception {
        // 模拟执行很费 时间的 业务逻辑
        Thread.sleep(3000);
        String result = this.para + "：处理完成。";
        return result;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        String queryStr = "query";

        // 构造FutureTask 并且传入需要真正进行业务逻辑处理的类，该类一定是实现了Callable 接口的类。
        FutureTask<String> future = new FutureTask<String>(new UseFuture(queryStr));
        // 创建一个固定线程池 线程数为1
        ExecutorService executor = Executors.newFixedThreadPool(1);
        // 这里提交任务Future 则开启线程执行RealData的call 方法执行。
        // submit() 也可以传一个实现了 Runnable 接口的线程类。
        // submit() 和 execute() 区别：1。submit() 可以传入实现Callable接口线程类对象。2。submit() 方法有返回值。 execute() 方法是没有返回值的。
        Future f = executor.submit(future); // 这里面只要一提交，就会有一个单独的线程去执行的。

        // 这里面在提交，它相当于是一个并行的在执行的。
//        Future f = executor.submit(future);
//        Future f = executor.submit(future);
        System.out.println("请求完毕。");

        // f.get() 返回一个 null 值 ，就代表当前任务已经执行完毕了。
//        System.out.println("get1111111:"+f.get());

        // 这里就可以做其它操作了，也就是主程序执行其它业务逻辑。
        Thread.sleep(1000);

        // 这个get() 是异步去获取结果的。如果下面哪个 “aaa" 直到打印出来，就是异步的。因为这里只有一个主线程。
        // 如果 get() 没有获取到结果，它会一起阻塞在这里。直到获取到结果为止。
        // 注：这个 future 是 FutureTask 的对象哦，和上面哪个 f 是两个概念。
        System.out.println("数据："+future.get());
        System.out.println("aaa");

        executor.shutdown();
    }
}
