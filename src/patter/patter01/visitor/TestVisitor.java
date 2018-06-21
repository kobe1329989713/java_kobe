package patter.patter01.visitor;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/03/28/ 16:01 星期三<BR>
 *
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class TestVisitor {
    public static void main(String[] args) {
        IVistor v = new VistorImpl();
        ISubJect s = new SubJectImpl();

        v.visit(s);
    }
}
