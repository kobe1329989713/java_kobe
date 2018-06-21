package javase01.cto51.theOldTan03.reflection;

import java.io.Serializable;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/03/12/ 21:41 星期一<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */

class Person extends Thread implements Serializable{

}

public class ClassInfo {
    public static void main(String[] args) {
        // 先得到 Class 对象。 反射核心。
        Class<Person> c = Person.class;
        System.out.println("得到类名：" + c.getName());
        System.out.println("得到全路径：" + c.getSimpleName());
        System.out.println("得到所在的包名：" + c.getPackage().getName());
        System.out.println("判断它是不是一个基本数据类型：" + c.isPrimitive());
        System.out.println("判断它是不是一个接口：" + c.isInterface());
        // 里面还有很多 isXxx() 开头的方法，判断它是不是  如，泛型  枚举 等。。。





    }
}
