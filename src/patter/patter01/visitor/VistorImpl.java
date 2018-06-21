package patter.patter01.visitor;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/03/28/ 16:00 星期三<BR>
 *
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class VistorImpl implements IVistor {
    @Override
    public void visit(ISubJect sub) {
        System.out.println("获取的主题是：" + sub.getSubject());
    }
}
