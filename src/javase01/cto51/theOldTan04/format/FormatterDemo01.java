package javase01.cto51.theOldTan04.format;

import java.util.Formatter;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/03/14/ 23:51 星期三<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class FormatterDemo01 {
    public static void main(String[] args) {
        Formatter f1 = new Formatter();
        // 把这个字符串按照 %S,%S 这种形式打印出来。
        Formatter abc = f1.format("%S,%S", "abc","def");
        System.out.println(abc);
    }
}
