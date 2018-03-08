package javase01.cto51.theOldTan03.date;

import java.time.LocalDate;
import java.time.Month;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/01/15/ 21:37 星期一<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class MonthDemo {
    public static void main(String[] args) {
        Month m = Month.OCTOBER;
        LocalDate d = LocalDate.of(2013, m, 12);
        System.out.println(d);

        Month m1 = Month.of(10);
        System.out.println(m == m1);

        // 加一个月。
        System.out.println(m1.plus(1));
        System.out.println(m1.plus(1).getValue());


        // 得到 d 的月份
        System.out.println(Month.from(d).getValue());
    }
}
