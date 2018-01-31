package Gdish.G005.g01.conn008;

import java.util.*;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/01/31/ 22:46 星期三<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>多线程使用 vector 或者 HashTable 的示列（简单线程同步问题）<BR>
 */
public class Tickets {
    public static void main(String[] args) {
        final Vector<String> tickets = new Vector<>();
        for (int i = 0; i < 1000; i++) {
            tickets.add("火车票" + i);
        }


        // Collections 里面有一系列的 synchronizedDXxx方法。
        // 作用就是：你传递一个 Collection 集合，或者是某一个具体的集合，它就会把这个集合加上一把锁了。就变成线程安全了
        // 如下 HashMap 就变成了线程安全的集合了，因为HashMap 本来是线程不安全的集合。
        // Vector 这种线程安全的集合 它低层的实现大概就是这样的。
        // jdk 很多地方都用到这个东东。
        Map<String,String> map = Collections.synchronizedMap(new HashMap<String, String>());



        // java.util.ConcurrentModificationException  把这里面的循环加上，它就会出现并发异常
        for (Iterator iterator = tickets.iterator();iterator.hasNext();) {
            String string = (String) iterator.next();
            tickets.remove(20);
        }

        for (int i = 0; i < 10; i++) {
            new Thread("线程" + i){
                @Override
                public void run() {
                    while (true) {
                        if (tickets.isEmpty()) break;
                        System.out.println(Thread.currentThread().getName() + "-----" + tickets.remove(0));
                    }
                }
            }.start();
        }
    }
}
