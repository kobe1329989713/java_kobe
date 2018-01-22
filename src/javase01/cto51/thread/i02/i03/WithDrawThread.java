package javase01.cto51.thread.i02.i03;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/01/18/ 22:47 星期四<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>取款线程<BR>
 */
public class WithDrawThread implements Runnable{
    // 往线程里面传递参数。
    private Account account;

    public WithDrawThread(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        account.withdraw(300);
    }
}
