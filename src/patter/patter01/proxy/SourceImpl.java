package patter.patter01.proxy;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/12/21/ 14:42 星期四<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class SourceImpl implements ISourceable{
    @Override
    public void method() {
        System.out.println("第一个 实现类。");
    }
}
