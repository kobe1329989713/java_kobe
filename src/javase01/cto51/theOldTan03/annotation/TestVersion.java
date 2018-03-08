package javase01.cto51.theOldTan03.annotation;

import javase01.cto51.theOldTan03.enum1.Season;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/03/06/ 23:56 星期二<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>使用 @Version 自定义注解。<BR>
 */

        // 给注解里面的各个属性进行赋值操作。
        // 不能给 null 的。
@Version(big = 1,
        small = 0,
        name = "Tom",
        c = Integer.class,
        a = @Anotation1,
        s = Season.AUTOMN,
        nums = {1,2,3}  /* 给注解里面数组赋值*/,
        // 如果这个数组只有一个值 可以省略掉 {} 大括号的。
        // 多个值 {} 就是必须的。
        ss = Season.AUTOMN

)
public class TestVersion {

}
