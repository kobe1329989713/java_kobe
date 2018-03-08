package javase01.cto51.theOldTan03.date;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/01/15/ 21:42 星期一<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class FieldDemo {
    public static void main(String[] args) {
        LocalDateTime t = LocalDateTime.now();
        System.out.println(t.get(ChronoField.YEAR));
        System.out.println(t.get(ChronoField.MONTH_OF_YEAR));
    }
}
