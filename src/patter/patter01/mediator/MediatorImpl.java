package patter.patter01.mediator;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/03/29/ 14:28 星期四<BR>
 *
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class MediatorImpl implements IMediator {

    private User u1;
    private User u2;


    @Override
    public void mediator() {
        // 确定 用哪个实现 ？？？？
        u1 = new User1(this);
        u2 = new User2(this);
    }

    @Override
    public void workAll() {
        // 调用方法了。
        u1.work();
        u2.work();
    }
}
