package patter.patter01.factory.easeFactory;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/12/18/ 22:42 星期一<BR>
 * <p>
 * <B>系统名称：</B>HelloWord<BR>
 * <B>概要说明：</B>工厂方法模式。<BR>
 */
public class SendFactory_02 {
    public ISend productMail() {
        return new MailSendImpl();
    }
    public ISend productSms() {
        return new SmsSendImpl();
    }
}
