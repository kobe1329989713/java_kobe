package patter.patter01.factory.easeFactory;

//import com.java1234.helloWord.factory.easeFactory.abstractFactory.Iprovider;
//import com.java1234.helloWord.factory.easeFactory.abstractFactory.MailSendFactoryImpl;
//import com.java1234.helloWord.factory.easeFactory.abstractFactory.SmsSendFactoryImpl;

import patter.patter01.factory.easeFactory.abstractFactory.Iprovider;
import patter.patter01.factory.easeFactory.abstractFactory.MailSendFactoryImpl;
import patter.patter01.factory.easeFactory.abstractFactory.SmsSendFactoryImpl;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/12/18/ 22:26 星期一<BR>
 * <p>
 * <B>系统名称：</B>HelloWord<BR>
 * <B>概要说明：</B>
 *
 * 简单工厂模式。
 * 工厂方法模式。
 * 静态工厂模式。
 * 抽象工厂模式。它就是对扩展开放，对修改关闭，因为在增加工厂时，自己增加一个实现类就好。？？？
 *
 * <BR>
 */
public class TestEasyFactory {
    public static void main(String[] args) {
//        SendFactory factory = new SendFactory();
//        try {
////            ISend send = factory.product("xx");
////            send.send();
//
//            ISend s1 = factory.product("sms");
//            s1.send();
//            ISend s2 = factory.product("email");
//            s2.send();
//        } catch (NoFounException e) {
//            e.printStackTrace();
//        }



        // 测试工厂方法模式。
//        SendFactory_02 s1 = new SendFactory_02();
//        ISend s2 = s1.productMail();
//        s2.send();
//        ISend s3 = s1.productSms();
//        s3.send();



        // 静态工厂模式测试。
//        ISend s1 = SendFactory_03.productMail();
//        s1.send();
//        ISend s2 = SendFactory_03.productSms();
//        s2.send();



        // 抽象工厂模式测试。
        Iprovider i1 = new MailSendFactoryImpl();
        ISend s1 = i1.product();
        s1.send();
        Iprovider i2 = new SmsSendFactoryImpl();
        ISend s3 = i2.product();
        s3.send();


    }
}
