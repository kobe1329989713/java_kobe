package patter.patter01.factory.easeFactory.abstractFactory;

import patter.patter01.factory.easeFactory.ISend;
import patter.patter01.factory.easeFactory.MailSendImpl;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/12/18/ 22:59 星期一<BR>
 * <p>
 * <B>系统名称：</B>HelloWord<BR>
 * <B>概要说明：</B>HelloWord<BR>
 */
public class MailSendFactoryImpl implements Iprovider{
    @Override
    public ISend product() {
        return new MailSendImpl();
    }
}
