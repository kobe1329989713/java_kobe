package patter.patter01.mediator;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/03/29/ 14:31 星期四<BR>
 *
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class User1 extends User {
    @Override
    public void work() {
        System.out.println("user111");
    }

    public User1(IMediator mediator) {
        super(mediator);
    }
}
