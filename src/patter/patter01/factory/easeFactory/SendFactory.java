package patter.patter01.factory.easeFactory;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/12/18/ 22:21 星期一<BR>
 * <p>
 * <B>系统名称：</B>HelloWord<BR>
 * <B>概要说明：</B>HelloWord<BR>
 */
public class SendFactory {
    public ISend product(String type) throws NoFounException {
        if ("email".equals(type)) {
            return new MailSendImpl();
        } else if ("sms".equals(type)) {
            return new SmsSendImpl();
        } else {
            throw new NoFounException("没有找到匹配类型");
        }
    }
}
