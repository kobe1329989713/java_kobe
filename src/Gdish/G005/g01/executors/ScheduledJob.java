package Gdish.G005.g01.executors;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/01/22/ 21:14 星期一<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
class Temp extends Thread {
    @Override
    public void run() {
        System.out.println("run");
    }
}

public class ScheduledJob {
    public static void main(String[] args) {
        Temp command = new Temp();
        // 可以实现定时器的哪种机制。
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);
                    // 参数意思是：               1。具体任务对象。2。初始化任务时间。3。轮循时间。4。指定 2 和 3 的单位。
        ScheduledFuture<?> scheduledFuture = executorService.scheduleWithFixedDelay(command, 1, 3, TimeUnit.SECONDS);
                                                //  它的意思是：这个任务 1秒后执行。3后秒轮循






    }
}
