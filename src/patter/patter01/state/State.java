package patter.patter01.state;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/03/28/ 15:20 星期三<BR>
 *
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class State {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void m1() {
        System.out.println("state==1");
    }
    public void m2() {
        System.out.println("state==2222222");
    }
}
