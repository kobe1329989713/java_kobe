package patter.patter01.builder;

import patter.patter01.factory.easeFactory.ISend;
import patter.patter01.factory.easeFactory.MailSendImpl;
import patter.patter01.factory.easeFactory.SmsSendImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/12/19/ 21:16 星期二<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>
 *  建行者模式：建选的每个对象，都不一样的。
 *      如果 下面这个，你每调用一次，就是获取 10 个这样的对象，类似于这样的需要，都可以用创建都模式来做。
 *
 * <BR>
 */
public class Builder {
    List<ISend> list = new ArrayList<>();

    public void productMeailSender(int count) {
        for (int i = 0; i < count; i++) {
            list.add(new MailSendImpl());
        }
    }

    public void productSmsSend(int count) {
        for (int i = 0; i < count; i++) {
            list.add(new SmsSendImpl());
        }
    }

}
