package javase01.cto51.theOldTan03.thread.calback;

import java.util.concurrent.*;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/01/18/ 23:22 星期四<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */



 class CalbackDemo1 implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        return 5;
    }
}

public class CalbackDemo {


    public static void  main(String[] args) throws ExecutionException, InterruptedException {

        //**---*/
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        Future<Integer> future = executorService.submit(new CalbackDemo1());
        executorService.shutdown();
        System.out.println(future.get());

        /*-------*/
        FutureTask<Integer> futureTask = new FutureTask<Integer>(new CalbackDemo1());
        new Thread(futureTask).start();
        System.out.println(futureTask.get());

    }

}
