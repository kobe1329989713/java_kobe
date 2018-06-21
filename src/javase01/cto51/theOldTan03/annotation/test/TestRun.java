package javase01.cto51.theOldTan03.annotation.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/03/08/ 21:25 星期四<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>
 *
 *  使用反射来解析 注解。
 *
 * <BR>
 */
public class TestRun {
    public static void main(String[] args) {
        Class<TestAnnotation> c = TestAnnotation.class;

        // 用反射到得 TestAnnotation 类的所有方法。
        Method[] ms = c.getDeclaredMethods();

        // 循环所有的方法 找出方法里面加了 @Test 注解的方法。
        for (Method method : ms) {
            // isAnnotationPresent()判断这个方法 是不是以某个注解修饰的。
            if (method.isAnnotationPresent(Test.class)) {

                // 获取注解里面的参数。
                Test t = method.getAnnotation(Test.class);
                System.out.println("获取注解里面的参数。"+t.num());


                // 就开始调用 被 @Test 修饰了的方法。
                try {
                    method.invoke(c.newInstance());
                } catch (IllegalAccessException | InvocationTargetException | InstantiationException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
