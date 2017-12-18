package patter.patter01.factory.easeFactory.exercise01;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/12/18/ 22:34 星期一<BR>
 * <p>
 * <B>系统名称：</B>HelloWord<BR>
 * <B>概要说明：</B>HelloWord<BR>
 */
public class SendFactory {
    public ISender product(String type) throws NoFoundException {
        if ("e".equals(type)) {
            return new MailSenderImpl();
        } else if ("s".equals(type)) {
            return new SmsSendImpl();
        } else {
            throw  new NoFoundException("没有找到。");
        }
    }
}
