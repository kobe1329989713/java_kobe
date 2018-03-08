package javase01.cto51.theOldTan03.annotation;

import java.lang.annotation.Annotation;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/03/07/ 0:19 星期三<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>
 *
 *  一个类实现一个注解。<BR>
 *      非正常 使用。
 */
public class MyClass1 implements Anotation1 {
    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
