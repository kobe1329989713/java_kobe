package Gdish.G005.g01.conn008;

import java.util.ArrayList;
import java.util.List;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/01/30/ 23:18 星期二<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>把下面的代码用 wait() 和 notify() 的方法来实现一次了。<BR>
 */
public class ListAdd1 {
    private volatile static List list = new ArrayList();

    public void add() {
        list.add("bjsxt");
    }

    public int size() {
        return list.size();
    }

    public static void main(String[] args) {
        final ListAdd1 list1 = new ListAdd1();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    list1.add();
                    System.out.println("当前线程： "+Thread.currentThread().getName()+"添加一个元素。。");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        },"t1");


        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    if (list1.size() == 5) {
                        System.out.println("当前线程收到通知："+Thread.currentThread().getName()+" list size = 5 线程停止。。");
                        throw new RuntimeException();
                    }
                }
            }
        },"t2");

        t1.start();
        t2.start();
    }
}
