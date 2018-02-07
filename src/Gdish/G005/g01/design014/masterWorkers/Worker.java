package Gdish.G005.g01.design014.masterWorkers;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/02/05/ 23:32 星期一<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class Worker implements Runnable {
    private ConcurrentLinkedQueue<Task> workerQueue;
    private ConcurrentHashMap<String, Object> resultMap;

    @Override
    public void run() {
        while (true) {
            // 从队列中取出一个元素，并把它移除掉。
            Task input = this.workerQueue.poll();
            if (input == null) {
                break;
            }
            // 真正的去做业务处理。
            Object output = handle(input);

            // 把每一个worker 处理了的结果，要装载到 master 的容器里面去。
            this.resultMap.put(input.getId() + "", output);
        }
    }

    // 处理业务的方法。
    private Object handle(Task input) {
        Object output = null;
        try {
            // 表示处理业务的耗时。
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        output = input.getPrice();
        return output;
    }

    public void setWorkerQueue(ConcurrentLinkedQueue<Task> workerQueue) {
        this.workerQueue = workerQueue;
    }

    public void setResultMap(ConcurrentHashMap<String, Object> resultMap) {
        this.resultMap = resultMap;
    }
}
