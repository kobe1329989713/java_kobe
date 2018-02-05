package Gdish.G005.g01.coll013;

import java.util.concurrent.PriorityBlockingQueue;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/02/01/ 1:16 星期四<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>PriorityBlockingQueue  它取元素 是根据你设置的 优先级来取元素的。不是先进先出的原则的。
 *
 *  结合到 Task 里面 比较器 方法一起看，哪里是重点。
 *
 *
 *  有问题 不对。
 *
 * <BR>
 */
public class UsePriorityBlockingQueue {
    public static void main(String[] args) throws InterruptedException {

        PriorityBlockingQueue<Task> q = new PriorityBlockingQueue<>();

        Task t1 = new Task();
        t1.setId(3);
        t1.setName("任务1");

        Task t2 = new Task();
        t2.setId(6);
        t2.setName("任务2");

        Task t3 = new Task();
        t3.setId(9);
        t3.setName("任务3");

        // 加到队列里。
        q.add(t1);
        q.add(t2);
        q.add(t3);
        System.out.println(q.toString());

        for (Task task : q) {
            System.out.println(task.getName());
        }



        System.out.println("============");
        // 你每次调用 take() 方法时 才给你排序。
        // 就是你在调用 take() 方法时，它优先拿的是 优先级最高的哪个元素。类似于选择排序。
        // 你调用 take() 方法时，它先内部比较下，拿取优先级最高的哪个拿出来，你每调用一次 都会执行这个操作。
        System.out.println("容器：" + q);
        System.out.println(q.take().getId());
        System.out.println("容器：" + q);
        System.out.println(q.take().getId());
        System.out.println(q.take().getId());
        // 队里面的总是最高优先级，每出队一个，第二优先级的顶到队头。
    }
}
