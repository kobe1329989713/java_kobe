package patter.patter01.mediator.xx01;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/03/29/ 16:31 星期四<BR>
 *
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class IMediatorImpl implements IMediator {

    private User u1;
    private User u2;

    @Override
    public void createMediator() {
        u1 = new UserImpl(this);
        u2 = new UserImpl02(this);
    }

    @Override
    public void workAll() {
        u1.work();
        u2.work();
    }
}
