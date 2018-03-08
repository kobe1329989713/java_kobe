package javase01.cto51.theOldTan03.enum1;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/02/28/ 21:06 星期三<BR>
 *
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class SwitchDemo {
    public static String getSeason(Season s) {
        switch (s) {
            case SPRING:
                return "spring";
            case AUTOMN:
                return "autome";
            case SUMMER:
                return "222";
            default:
                return "kobe";

        }
    }

    public static void main(String[] args) {
        // 如果你传一个非枚举，它从语法上面就不让你通过的，所以上面 default 是执行不到的。
        // null 就 空指针。
        System.out.println(getSeason(Season.SPRING));
    }

}
