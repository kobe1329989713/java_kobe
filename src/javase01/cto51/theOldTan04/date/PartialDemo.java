package javase01.cto51.theOldTan04.date;

import java.time.Year;
import java.time.YearMonth;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/03/13/ 22:58 星期二<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class PartialDemo {
    public static void main(String[] args) {
        // 只得到 年。
        Year y = Year.of(2013);
        // 它里面也有 加减 时间的方法。
        System.out.println(y);

        // 一样。
        YearMonth ym = YearMonth.of(2014, 3);
    }
}
