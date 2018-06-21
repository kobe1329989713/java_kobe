package patter.patter01.mediator.xx01;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/03/29/ 16:27 星期四<BR>
 *
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public abstract class User {
    private IMediator mediator;

    public User(IMediator mediator) {
        this.mediator = mediator;
    }

    public abstract void work();
}
