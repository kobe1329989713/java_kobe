package patter.patter01.state;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/03/28/ 15:23 星期三<BR>
 *
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    // set  get  赋值。
    public void method() {
        if (state.getState().equals("m1")) {
            state.m1();
        } else if (state.getState().equals("m2")) {
            state.m2();
        }
    }
}
