package patter.patter01.builder;

import patter.patter01.factory.easeFactory.ISend;

import java.util.List;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/12/19/ 21:29 星期二<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class TestBuilder {
    public static void main(String[] args) {
        Builder b = new Builder();
//        b.productMeailSender(10);

//        List<ISend> s1 = b.list;
//        for (ISend iSend : s1) {
//            iSend.send();
//        }


        System.out.println("=======================================================================");
        b.productSmsSend(4);
        List<ISend> s3s = b.list;
        for (ISend s3 : s3s) {
            s3.send();
        }
    }
}
