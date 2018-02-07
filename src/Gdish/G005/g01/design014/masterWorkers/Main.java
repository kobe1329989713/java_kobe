package Gdish.G005.g01.design014.masterWorkers;

import java.util.Random;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/02/05/ 23:58 星期一<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class Main {
    public static void main(String[] args) {
        Master master = new Master(new Worker(), 10);

        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            Task t = new Task();
            t.setId(i);
            t.setName("任务" + i);
            t.setPrice(r.nextInt(1000));
            master.submit(t);
        }

        master.execute();

        long start = System.currentTimeMillis();


        // isComplete() 判断 master 是否执行完毕了。
        while (true) {
            if (master.isComplete()) {
                long end = System.currentTimeMillis() - start;
                int ret = master.getResult();
                System.out.println("最终结果：" + ret + "，执行耗时：" + end);
                break;
            }
        }


    }
}
