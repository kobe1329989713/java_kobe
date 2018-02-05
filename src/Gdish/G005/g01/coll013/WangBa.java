package Gdish.G005.g01.coll013;

import java.util.concurrent.DelayQueue;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/02/05/ 20:16 星期一<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>队列模拟 上网吧。<BR>
 */
public class WangBa implements Runnable {

    // 一个容器。队列。
    private DelayQueue<Wangmin> queue = new DelayQueue<>();
    // 营业。
    public boolean yinye = true;

    // 开始上机的方法，
    public void shangji(String name, String id, int money) {
        // System.currentTimeMillis() 获取当前系统时间。
        Wangmin man = new Wangmin(name, id, 1000 * money + System.currentTimeMillis());
        System.out.println("网名："+man.getName()+"，身份证："+man.getId()+"，交钱："+money+"块，开始上机。");
        // 回到队列里。
        this.queue.add(man);
    }

    // 下机
    public void xiaji(Wangmin man) {
        System.out.println("网名："+man.getName()+"，身份证："+man.getId()+"时间到下机。");
    }
    @Override
    public void run() {
        while (yinye) {
            Wangmin man = null;
            try {
                // 从队列里面获取一个元素。
                man = queue.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            xiaji(man);
        }
    }

    public static void main(String[] args) {
        System.out.println("网吧开始营业。");
        WangBa siyu = new WangBa();
        Thread shangwang = new Thread(siyu);
        shangwang.start();

        // 延迟的操作，时间到了 人 才下机。
        siyu.shangji("路人甲","123",1);
        siyu.shangji("路人2","234",10);
        siyu.shangji("路人3","345",5);
    }
}
