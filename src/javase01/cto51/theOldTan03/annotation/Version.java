package javase01.cto51.theOldTan03.annotation;

import javase01.cto51.theOldTan03.enum1.Season;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/03/06/ 23:53 星期二<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public @interface Version {
    // 这个 big() small() 它们都是注解上面的属性。
    // 这个 属性只能传 int 类型的 因为申明这个 big() 就是int类型的。
    int big();
    int small();

    // 给申明注解的属性给 默认值。
    // 如果你不给默认值，要使用这个注解时，这个属性就必须要传。
    String name() default "";
    Class c() default String.class;
    // 还可以是另外一个注解。
    Anotation1 a() default @Anotation1;
    // 枚举。
    Season s() default Season.AUTOMN;
    int[] nums() default {1,2,3,4};

    // 申明一个枚举数组的属性。
    Season[] ss();
}
