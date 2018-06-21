package javase01.cto51.theOldTan03.reflection;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/03/12/ 21:38 星期一<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class PackageInfo {
    public static void main(String[] args) {
        Package p = Package.getPackage("java.lang");
        System.out.println(p.getName());
        // 这里面还有很多 方法，查询 api



        // 得到下面所有的包。
        Package[] ps = Package.getPackages();
        for (Package p1 : ps) {
            System.out.println(p1.getName());
        }

    }
}
