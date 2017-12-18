package patter.patter01.factory.easeFactory.exercise01;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/12/18/ 22:37 星期一<BR>
 * <p>
 * <B>系统名称：</B>HelloWord<BR>
 * <B>概要说明：</B>HelloWord<BR>
 */
public class TestEasyFactory {
    public static void main(String[] args) {
        SendFactory s1 = new SendFactory();
        try {
            ISender s2 = s1.product("e");
            s2.send();
            ISender s3 = s1.product("s");
            s3.send();
            ISender s4 = s1.product("kobe");
            s4.send();
        } catch (NoFoundException e) {
            e.printStackTrace();
        }
    }
}
