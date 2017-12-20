package patter.patter01.adapter;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/12/20/ 11:19 星期三<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 *
 * <B>概要说明：</B>对象的适配：<BR>
 */
public class Wrappter implements ITargetable{
    private Source source;

    public Wrappter(Source source) {
        this.source = source;
    }

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("thie is the targetable method");
    }
}
