package javase01.cto51.theOldTan04.string;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/03/12/ 22:18 星期一<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class StringDemo {
    public static void main(String[] args) {
        String s = "\r";
        System.out.println(s);

        // 是一种 uni code 的码
        System.out.println("ab\u0041");

        // ""  也是一个字面量，也就是一个 String 对象，因为 “” 也是可以调用方法的。


        String s1 = "abc";
        String s4 = "abc";
        String s2 = new String("abc");
        String s3 = new String("abc");
        // false 因为 s2 是在 堆里面，而 s1 是在栈里面。
        System.out.println(s1==s2);
        // 它因为它们都是在栈里面找。
        System.out.println(s1==s4);


        String str1 = new String("Hello");
        String str2 = new String("Hello");
        String str3 = "Hello";
        String str4 = "Hello";
        String str5 = "He" + "llo";

        System.out.println("========");


        // false 因为都是在堆里面，而堆，是每个对象拥有不同的空间。
        System.out.println(str1==str2);
        // false 一个在堆 一个栈
        System.out.println(str1==str3);
        // true 都是在 栈里。
        System.out.println(str3==str4);
        // 拼接起来的 等于字符串常理池里面的一个，所有也是相等的，所以就是 true.
        System.out.println(str3==str5);


        System.out.println("========");

        final String cons = "He";
        String vs = "He";
        String s6 = cons + "llo";
        String s7 = vs + "llo";
        // true 因为 final 修饰了的，它本身就是字符串常理池里面。
        System.out.println("Hello" == s6);
        // false 因为 s7 是一个变量，它是在 运行时，才能确定的。
        System.out.println("Hello" == s7);
        // 这样，就可以把 一个 变量的字符串值，放在 字符串常量池里面去。
        System.out.println("Hello" == ("He"+s7).intern());

        //intern() 把一个??
        String k = "He";
        System.out.println((k + "llo").intern() == "Hello");
        // 反过来就是false 了。因为只有在前面时，它是先加入到了字符串常量池里面去，而你后面就 加不了。所以false。
        System.out.println("Hello" == ("He" + k).intern());


    }
}
