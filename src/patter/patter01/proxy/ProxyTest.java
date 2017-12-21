package patter.patter01.proxy;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/12/21/ 14:45 星期四<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>
 *
 *
 *      代理模式：
 *          和装饰有点类似。
 *          代理时，是一个空构造 里 new 第一个实现类。
 *
 *
 *
 *          代理就是 第二个实现类代理，第一个实现类的访问。
 *
 *          替原对象，多干一些事情，有一些增加味道。
 *
 * <BR>
 */
public class ProxyTest {
    public static void main(String[] args) {
        ISourceable s1 = new Proxy();
        s1.method();
    }
}
