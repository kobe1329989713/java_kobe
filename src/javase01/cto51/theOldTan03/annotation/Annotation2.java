package javase01.cto51.theOldTan03.annotation;

import java.lang.annotation.*;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/03/07/ 0:32 星期三<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */


// ElementType.TYPE   只能加在类上
// ElementType.METHOD   只能加在普通方法。
// ElementType.PARAMETER   只能加在参数。
// ElementType.CONSTRUCTOR   只能加在构造。
// ElementType.FIELD   只能加在成员。
@Target({ElementType.TYPE,
        ElementType.METHOD,
        ElementType.PARAMETER,
        ElementType.CONSTRUCTOR,
        ElementType.FIELD
})

@Retention(RetentionPolicy.RUNTIME)

@Inherited
public @interface Annotation2 {
    String[] value() default {"a","b","c"};
}
