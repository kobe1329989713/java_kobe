package Gdish.G005.g01.coll013;

import java.util.concurrent.SynchronousQueue;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/02/01/ 0:23 星期四<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>队列的使用。<BR>
 */
public class UseQueue {
    public static void main(String[] args) throws InterruptedException {
        // 高性能无阻塞队列：ConcurrentLinkdQueue ,在查看下 api 文档，就可以使用了。
//        ConcurrentLinkedQueue<String> q = new ConcurrentLinkedQueue<>();
//        q.offer("a");
//        q.offer("b");
//        q.offer("c");
//        q.offer("d");
//        q.add("e");
//
//        // 主意方法的区别，注：它是队列的 先进先出，先取出的是 头，所以打印的是 a, 看打印结果想结果。
//        // poll() 从头部取出元素并从队列里面删除这个元素。
//        // peek() 出题从头部取出元素，但是它不会删除元素。
//        System.out.println(q.poll());
//        System.out.println(q.size());
//        // 它不会删除死 所以它的size 还是 4
//        System.out.println(q.peek());
//        System.out.println(q.size());




        // 有界队列
//        ArrayBlockingQueue<String> array = new ArrayBlockingQueue<>(5);
//        // 参数是： 1加的元素  2 是一个数值， 3 是2 的一个单位， 2 和 3 就是代表 2秒钟，你在 2秒钟之内加这个元素，2秒钟之内加进去了就返回 true ，加不进就是 false
//        array.put("b");
//        array.put("c");
//        array.add("d");
//        array.add("e");
//        array.add("f");
//        boolean result = array.offer("a", 2, TimeUnit.SECONDS);
//        System.out.println(result);




        // 阻塞队列, 构造里面不传入 容量，它就是一个无界队列，传入了，就只能放入 这么多元素了。 哪种有界队列 的构造就是必须要传入一个 容量的。
//        LinkedBlockingQueue<String> q = new LinkedBlockingQueue<>(5);
//        q.offer("a");
//        q.offer("b");
//        q.offer("c");
//        q.offer("d");
//        q.offer("e");
//        q.add("f");
//        System.out.println(q.size());
//        for (Iterator iterator = q.iterator();iterator.hasNext();) {
//            String s = (String) iterator.next();
//            System.out.println(s);
//        }

//        List<String> list = new ArrayList<>();
        // drainTo() 从 q 这个队列中取出3 个元素放入到 list 这个集合当中。
        // 就是批量从队列当中获取元素 放入到 Conllection 下面的集合都是可以的。
//        System.out.println(q.drainTo(list, 3));
//        System.out.println(list.size());
//        for (String s : list) {
//            System.out.println(s);
//        }



        // 这种队列 是不允许加入元素的。q 他是没有容量的，所以加不进去。
//        SynchronousQueue<String> q = new SynchronousQueue<>();
//        q.add("a");
//        q.offer("B");


        /**
         *  8点 到 9点 车流量 巨多  用 ArrayBlockingQueue  有界队列，限制队列 装载过多，把内存撑爆
         *  9点 到 下午5点之前  没有多少车  可以用 LinkedBlockingQueue 无界队列 ，来一个处理一个 因为没有多少数据的
         *  下半夜 12点 到 6点之前  没有什么车了  用  SynchronousQueue 队列 直接把 车给线程处理掉了，不经过队列存储了 直接处理掉，就相当于 生产者 生产的数据 直接给消费者 消费掉
         *
         *  这三种效率最高。
         */


        final SynchronousQueue<String> q = new SynchronousQueue<>();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                                    // 它调用 take() 方法时没有元素应付阻塞在这里面，t2 哪个线程就可以往里面添加元素了。因为t1线程在哪里加时，它不是直接往队列里面添加元素而是 直接给 t2 这个线程了，所以它 take() 可以
                    // 获取到元素。就相当于上面哪个 下半夜 处理的方式。它必须先 take() 才能调用 add() 方法往里面添加元素
                    System.out.println(q.take());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();


        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                // 这样就能加进去
                q.add("addd");
            }
        });
        t2.start();
    }
}
