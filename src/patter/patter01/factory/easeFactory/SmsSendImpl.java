package patter.patter01.factory.easeFactory;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/12/18/ 22:20 星期一<BR>
 * <p>
 * <B>系统名称：</B>HelloWord<BR>
 * <B>概要说明：</B>HelloWord<BR>
 */
public class SmsSendImpl implements ISend{
    @Override
    public void send() {
        System.out.println("thie is the sms");
    }
}
