package javase01.cto51.theOldTan03.thread.i02.i03;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/01/18/ 22:49 星期四<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class WithDrawTest {
    public static void main(String[] args) {
        Account account = new Account();

        for (int i = 0; i < 10; i++) {
            // 一线线程取款。
            Thread t1 = new Thread(new WithDrawThread(account));
            t1.start();
        }
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("余额为："+account.getMoney());
    }
}
