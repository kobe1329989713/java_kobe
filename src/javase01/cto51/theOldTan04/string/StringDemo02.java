package javase01.cto51.theOldTan04.string;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/03/12/ 23:50 星期一<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class StringDemo02 {
    public static void main(String[] args) {
        String s = "abcdefcdkkss";
        System.out.println(s.charAt(2));

//        String s1 = "";
        String s1 = new String();
        System.out.println(s1.isEmpty());
        // false 因为它是在堆里面，"" 也是代表String 类的一个对象了。
        // "" 它是可以调用方法的.
        System.out.println(s1 == "");
        // 这样比较可能会出现 空指针异常了，  因为 s1 有可以 == null ,你在调用方法就会？？
        System.out.println(s1.equals(""));
        // 开发中 用这样的。
        System.out.println("".equals(s1));


        // 找不到返回 -1
        System.out.println(s.indexOf(3));
        System.out.println(s.indexOf("cd"));
        // 从指定 位置开始找。
        System.out.println(s.indexOf("cd", 3));


        // 找到 字符串 最后出现的位置。
        System.out.println(s.lastIndexOf("cd"));
        // 也可以从指定位置开始找。
        System.out.println(s.lastIndexOf("cd",4));


        // abcdefcdkkss
        // 从3 的位置，截取到最后 全部的值。
        // 包左的，就从3 这个位置开始算起走的。
        System.out.println(s.substring(3));
        // 包左 不包右的。
        System.out.println(s.substring(3, 5));
        System.out.println(s.trim());
        // 转义字符，也会被消灭掉。
        System.out.println("\r as \n".trim().length());


        System.out.println(s.replace("c","C"));
        System.out.println(s.replace("cd","xx"));
        System.out.println(s.startsWith("d"));
        System.out.println(s.endsWith("d"));

        System.out.println("==========");
        String[] xes = s.split("s");
        for (String x : xes) {
            System.out.println(x);
        }

        System.out.println("==========");
        String join = String.join("#", "a", "b", "c");
        System.out.println(join);


        String s2 = String.valueOf(22);
        System.out.println(s2);

        // 还可以传一个数组。
        System.out.println(String.valueOf((new char[]{'a', 'b', 'c', 'd'}), 1, 2));



        // 字典比较。字母顺序比较。
        System.out.println("abc".compareTo("bcd"));




    }
}
