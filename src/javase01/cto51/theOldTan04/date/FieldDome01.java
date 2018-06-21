package javase01.cto51.theOldTan04.date;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/03/13/ 22:36 星期二<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class FieldDome01 {
    public static void main(String[] args) {
        LocalDateTime t = LocalDateTime.now();
        int i = t.get(ChronoField.YEAR);
        int i1 = t.get(ChronoField.MONTH_OF_YEAR);
        System.out.println(i);
        System.out.println(i1);
    }
}
