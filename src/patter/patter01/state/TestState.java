package patter.patter01.state;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/03/28/ 15:25 星期三<BR>
 *
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class TestState {
    public static void main(String[] args) {
        State s = new State();
//        print.setState("m1");
        s.setState("m2");

        Context c = new Context(s);
        c.method();
    }
}
