package javase01.cto51.theOldTan03.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/03/08/ 21:20 星期四<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
// 只能用于 方法上，因为只会一个参数，所以可以省略掉 {}
@Target(ElementType.METHOD)
public @interface Test {
    int num();
}
