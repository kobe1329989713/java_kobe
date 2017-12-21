package patter.patter01.decorator;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/12/21/ 13:39 星期四<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>
 *
 *      1.装饰的哪个类，也要实现 ISourceable 实现，
 *      2.在组合 ISourceable
 *      3.在 override 里面 调用另一个实现方法。
 *      4.来到达装饰的目的，实现增加操作。
 *
 * <BR>
 */
public class TestDecorator {
    public static void main(String[] args) {
        ISourceable sourceable = new SourceImpl();
        Decorator decorator = new Decorator(sourceable);
        decorator.method();
    }
}
