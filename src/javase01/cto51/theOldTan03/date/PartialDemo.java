package javase01.cto51.theOldTan03.date;

import java.time.Year;
import java.time.YearMonth;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/01/15/ 22:11 星期一<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class PartialDemo {
    public static void main(String[] args) {
        // 一部分时间。
        Year y = Year.of(2014);
        YearMonth ym = YearMonth.of(2014, 12);
    }
}
