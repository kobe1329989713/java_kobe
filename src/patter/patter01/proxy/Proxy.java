package patter.patter01.proxy;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/12/21/ 14:42 星期四<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class Proxy implements ISourceable{
    private ISourceable source;

    // 代理模式，这里是重点。
    public Proxy() {
        // 这里面就是 替哪个类，多干一些事情。
        this.source = new SourceImpl();
    }

    @Override
    public void method() {
        befor();
        source.method();
        after();
    }

    private void after() {
        System.out.println("方法之后 ，执行 22222");
    }

    private void befor() {
        System.out.println("方法之前，执行 11111");
    }

}
