package patter.patter01.mediator.xx01;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/03/29/ 16:29 星期四<BR>
 *
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class UserImpl extends User {
    public UserImpl(IMediator mediator) {
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("11111111111");
    }
}
