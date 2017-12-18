package patter.patter01.factory.easeFactory.abstractFactory;

import com.java1234.helloWord.factory.easeFactory.ISend;
import com.java1234.helloWord.factory.easeFactory.SmsSendImpl;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/12/18/ 23:00 星期一<BR>
 * <p>
 * <B>系统名称：</B>HelloWord<BR>
 * <B>概要说明：</B>HelloWord<BR>
 */
public class SmsSendFactoryImpl implements Iprovider{
    @Override
    public ISend product() {
        return new SmsSendImpl();
    }

}
