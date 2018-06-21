package javase01.cto51.theOldTan04.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/03/13/ 0:29 星期二<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class RegDemo01 {
    public static void main(String[] args) {
        String s = "sadcaa";
        // 它匹配 一个a 字符，出现任意一个 就可以，后面还有跟一个 c。
        // 就是 查询一个 ac 的字符。
        String reg = "a[def]c";
        boolean b = s.matches(reg);
        System.out.println(b);

        // 匹配上的，就替换成 X
        String x = "cdeabcadebha".replaceAll(reg, "X");
        System.out.println(x);
        // 只替换匹配上的，第一个。
        String x1 = "cdeabcadebha".replaceFirst(reg, "X");



        // 把正则编译进 内存里面去，使正则 匹配的更快。
        // reg 你写的一个正则， 这个是一个单独的主题，baidu
        Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher("abcde");
        boolean b1 = m.find();
        System.out.println(b1);


    }
}
