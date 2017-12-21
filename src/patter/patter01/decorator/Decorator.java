package patter.patter01.decorator;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/12/21/ 13:37 星期四<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class Decorator implements ISourceable{
    private ISourceable source;

    public Decorator(ISourceable source) {
        this.source = source;
    }

    @Override
    public void method() {
        System.out.println("befor method");
        source.method();
        System.out.println("after method");
    }
}
