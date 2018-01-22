package javase01.cto51.thread.i02.i03;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/01/18/ 22:43 星期四<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>
 *
 *          java 的内存模型
 *              每个线程都有一个工作内存。线程是把 主内存里面的数据 copy 到自己线程的工作内存里面去，计算完毕在 copy 加 主内存去。
 *              所以 就有一个并发问题。所以 就有线程安全问题。
 *              java 有一个 主内存
 *
 *              线程之间共享数据是通过 主内存 来完成的。
 *
 *              线程之间的工作内存 线程之间是不能访问的。
 *
 * <BR>
 */
public class Account {
    private int money = 1000;

    // 取钱。 synchronized 不加就是 线程不安全的。线程不安全了，你把这个 synchronized 去掉试试。
    public synchronized void withdraw(int money) {
        if (money <= 0) {
            System.out.println("取款金额必须大于0");
            return;
        }
        if (money > this.money) {
            System.out.println("取款金额不能高于当前余额");
            return;
        }

        // 真正取钱操作了。
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.money -= money;
        System.out.println("取款成功! 取款：" + money);
    }

    public int getMoney() {
        return money;
    }
}
