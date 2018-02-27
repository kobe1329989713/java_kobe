package patter.patter01.prototype;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/02/14/ 11:02 星期三<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class TestProtoType {
    public static void main(String[] args) {
        ProtoType p = new ProtoType();
        p.setString("kobe");
        System.out.println("pppppppp: "+p.getString());
        try {
            ProtoType p2 = (ProtoType) p.clone();
            p2.setString("p2, p2,");
            System.out.println("p2: "+p2.getString());

            ProtoType p3 = (ProtoType) p.deepClone();
            p3.setString("p3 , p3");
            System.out.println("p3: "+p3.getString());

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
