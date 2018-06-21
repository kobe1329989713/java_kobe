package patter.patter01.mediator;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/03/29/ 15:03 星期四<BR>
 *
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class TestMediator {
    public static void main(String[] args) {
        IMediator mediator = new MediatorImpl();
        mediator.mediator();
        mediator.workAll();
    }
}
