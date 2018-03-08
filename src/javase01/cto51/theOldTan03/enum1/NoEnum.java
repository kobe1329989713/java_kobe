package javase01.cto51.theOldTan03.enum1;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/02/28/ 20:24 星期三<BR>
 *
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>没有枚举。<BR>
 */

// 创建一个枚举，它里面只有 这两个实列
enum Gender{
    MALE,FEMALE;
}

public class NoEnum {
//    public static String getGender(char c) {
//        if (c == 'f') {
//            return "女";
//        } else if (c == 'm') {
//            return "男";
//        } else {
//            return "";
//        }
//    }
    // 用枚举来做。就限定了，它，只能传递枚举里面定义的哪些实列了。
    public static String getGender(Gender g) {
        return "";
    }

    public static void main(String[] args) {
//        System.out.println(getGender('f'));
    }
}
