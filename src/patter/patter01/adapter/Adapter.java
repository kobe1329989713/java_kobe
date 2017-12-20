package patter.patter01.adapter;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/12/20/ 11:08 星期三<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class Adapter extends Source implements ITargetable{
    @Override
    public void method2() {
        System.out.println("thie is the targetabl method");
    }
}
