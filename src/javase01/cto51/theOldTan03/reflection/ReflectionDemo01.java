package javase01.cto51.theOldTan03.reflection;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/03/12/ 21:07 星期一<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */

class User{
    static {
        System.out.println("user init");
    }
}

public class ReflectionDemo01 {

    static void create1() {
        new User();
    }

    static void create2() {

    }

    public static void main(String[] args) throws ClassNotFoundException {

        create1();



//        Class<String> c = String.class;
//
//        String s = "";
//        Class<?> c1 = s.getClass();
//
//        // 它的第二重载，boolean 是否初始化， 类加载器。
//        Class<?> c3 = Class.forName("");
//
//        // 以上三种就得到一个 Class 对象。了 就可以通过反射。获取N多东东。

    }
}
