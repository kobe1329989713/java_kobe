package patter.patter01.visitor;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/03/28/ 15:56 星期三<BR>
 *
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public interface ISubJect {
    void accept(IVistor vistor);

    String getSubject();
}
