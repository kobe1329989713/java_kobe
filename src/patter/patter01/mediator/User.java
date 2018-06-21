package patter.patter01.mediator;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/03/29/ 14:29 星期四<BR>
 *
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public abstract class User {
    private IMediator mediator;


    public abstract void work();


    // get() set()  构造。
    public User(IMediator mediator) {
        this.mediator = mediator;
    }

    public IMediator getMediator() {
        return mediator;
    }

    public void setMediator(IMediator mediator) {
        this.mediator = mediator;
    }
}
