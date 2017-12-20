package patter.patter01.adapter.interAdapter;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/12/20/ 11:31 星期三<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class TestInterAdapter {
    public static void main(String[] args) {
        ISourceable s1 = new SourceImpl01();
        s1.method1();
        s1.method2();

        ISourceable s2 = new SourceImpl02();
        s2.method2();
        s2.method1();
    }
}
