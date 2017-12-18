package patter.patter01.factory.easeFactory;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/12/18/ 22:47 星期一<BR>
 * <p>
 * <B>系统名称：</B>HelloWord<BR>
 * <B>概要说明：</B>静态工厂模式。<BR>
 */
public class SendFactory_03 {
    public static ISend productMail() {
        return new MailSendImpl();
    }

    public static ISend productSms() {
        return new SmsSendImpl();
    }
}
