package javase01.cto51.theOldTan03.enum1;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/02/28/ 20:40 星期三<BR>
 *
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>使用枚举<BR>
 */
public class TestNum {
    public static void main(String[] args) {
        // 使用枚举
        Season eq = Season.AUTOMN;

        // for enum
        Season[] s= Season.values();
        for (Season season : s) {
            // 得到枚举的名字。
            System.out.println(season.name());
            // 得到枚举的序号。
            System.out.println(season.ordinal());
        }

        // 通过一个枚举又得到一个枚举。
        // 区分大小的。
        Season winter = Season.valueOf("WINTER");
        System.out.println("44: "+winter);


        Season02 season02 = Season02.valueOf("WINTER");
        season02.setName("往枚举里面的成员赋值。");
        System.out.println(season02.ordinal());
        System.out.println(season02.getName());

        Season02 spring = Season02.SPRING;
        System.out.println(spring.getName());
        spring.m2();



        // 测试内部 枚举类，和 内部类一样。
        NestedEnum.Gender male = NestedEnum.Gender.MALE;
    }
}
