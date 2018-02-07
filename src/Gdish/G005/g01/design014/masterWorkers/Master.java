package Gdish.G005.g01.design014.masterWorkers;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/02/05/ 23:32 星期一<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>实现一个 master - worker 模式<BR>
 */
public class Master {
    // 1.应该有一个承装任务的集合。
    private ConcurrentLinkedQueue<Task> workQueue = new ConcurrentLinkedQueue<>();

    // 2.使用普通的HashMap 承装所有worker对象。
    private HashMap<String, Thread> workers = new HashMap<>();

    // 3.使用一个容器承装每一个worker并非执行任务结果集。
    private ConcurrentHashMap<String, Object> resultMap = new ConcurrentHashMap<>();

    // 4. 构造方法
    public Master(Worker worker,int workerCount) {

        // 每一个worker 对象需要有Master 的引用。workQueue用于任务领取，resultMap用于任务提交 给master ，就是装载到master 里面的容器里。
        worker.setWorkerQueue(this.workQueue);
        worker.setResultMap(this.resultMap);

        for (int i = 0; i < workerCount; i++) {
            // key 表示第一个 worker名字。value 表示线程执行对象。
            workers.put("子节占" + Integer.toString(i), new Thread(worker));
        }
    }


    // 5. 提交方法。
    public void submit(Task task) {
        this.workQueue.add(task);
    }

    // 6.需要一个执行的方法。启动应用程序 让所有的worker 工作。
    public void execute() {
        for (Map.Entry<String, Thread> me : workers.entrySet()) {
            me.getValue().start();
        }
    }


    // 7。判断线程是否执行完毕。
    public boolean isComplete() {
        for (Map.Entry<String, Thread> me : workers.entrySet()) {
            // Thread.State.TERMINATED 当前线程是否处于停止状态。
            if (me.getValue().getState() == Thread.State.TERMINATED) {
                return false;
            }
        }
        return true;
    }

    // 8.返回结果集。
    public int getResult() {
        int ret = 0;
        for (Map.Entry<String, Object> me : resultMap.entrySet()) {
            ret += (Integer) me.getValue();
        }
        return ret;
    }
}
