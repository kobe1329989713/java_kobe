package patter.patter01.factory.easeFactory.exercise01;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/12/18/ 22:33 星期一<BR>
 * <p>
 * <B>系统名称：</B>HelloWord<BR>
 * <B>概要说明：</B>HelloWord<BR>
 */
public class MailSenderImpl implements ISender {
    @Override
    public void send() {
        System.out.println("thie is the mail");
    }
}
