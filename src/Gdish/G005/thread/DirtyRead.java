package Gdish.G005.thread;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/01/24/ 22:28 星期三<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>脏读<BR>
 */
public class DirtyRead {
    private String username = "bjsxt";
    private String password = "123";

    public synchronized void setValue(String username, String password) {
        this.username = username;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.password = password;
        System.out.println("setValue最终结果：username = " + username + ", password = " + password);
    }

    // 这里面必须要加 synchronized 不然设置不进 password 了， 要这两个方法保持同步才行。
    public synchronized void getValue() {
        System.out.println("getValue方法得到：username = " + this.username + ", password = " + this.password);
    }

    public static void main(String[] args) throws InterruptedException {
        final DirtyRead dr = new DirtyRead();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                dr.setValue("z3", "456");
            }
        });
        t1.start();
        Thread.sleep(1000);
        dr.getValue();

    }
}
