package kobe01;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/04/01/ 21:26 星期日<BR>
 *
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class StringDemo {
    public static void main(String[] args) {
        String s = new String("123456");
        System.out.println("====: "+s);
        System.out.println("====: "+s.length());
        System.out.println(s.charAt(0));

        // codePointAt()  如果是 a 打印 97 的哪个，？？
        // codePointAt() 看这个字符的 字节是什么
        s = "abcdefg";
        System.out.println(s.codePointAt(0));// 打印 97

        // 和 codePointAt() 差不多的，只不过是前一个字符的。
        System.out.println(s.codePointBefore(1));
        // 返回两个索引 之间有多少字符
        System.out.println(s.codePointCount(1,4));

        // 字典比较。
        // 0 代表它的字典顺序是相同的。
        // 区分大写的 Ignore
        String a = "a";
        System.out.println("字典比较。" + a.compareTo("A"));
        System.out.println("字典比较。（忽略大小写）" + a.compareToIgnoreCase("A"));

        /**
         * String 是默认实现了三个接口的，序列化  charSequence  比较接口,
         * 哪就说明 String 是属于这三个接口 类型的。
         */
        a = "abcdef";
        System.out.println("是否包含："+a.contains("de"));
        System.out.println("是否包含："+a.contentEquals("de"));
        // 全部一样 才返回 true
        System.out.println("是否包含："+a.contentEquals("abcdef"));


        Integer i = 22;
        a = String.valueOf(i);
        System.out.println(a);

        char[] chars = {'a', 'b', 'c'};
        String s1 = a.copyValueOf(chars);
        System.out.println(s1);
        System.out.println(s1.endsWith("c"));
        System.out.println(s1.startsWith("a"));
        System.out.println("a".equals(a));
        System.out.println("a".equalsIgnoreCase(a));


        System.out.println(String.format("%s", s1));
        System.out.println(String.format("%c", 'a'));
        s1 = String.format("Hi,%s:%s.%s", "王南", "王力", "王张");
        System.out.println(s1);
        byte[] bytes = s1.getBytes();
        for (byte b : bytes) {
            System.out.println(b);
        }
        String s2 = new String(bytes);
        System.out.println(s2);


        System.out.println(s2.hashCode());


        System.out.println(s2.indexOf("王力"));
        System.out.println("===: " + s2.intern());
        System.out.println("===: " + s2.isEmpty());
        System.out.println("===: " + String.join("#####","kob01","kobe02","kobe03"));















    }
}
