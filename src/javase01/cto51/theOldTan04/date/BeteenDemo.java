package javase01.cto51.theOldTan04.date;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/03/13/ 22:52 星期二<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class BeteenDemo {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.of(2013, 12, 1);
        LocalDate d2 = LocalDate.now();
        // 相隔多少天。你要相隔多少 年  月 日 时 分 秒 毫秒，只需改这个枚举单位就好。
        long between = ChronoUnit.DAYS.between(d1, d2);
        long between1 = ChronoUnit.MONTHS.between(d1, d2);
        System.out.println(between);
        System.out.println(between1);

        // 两个时间 相隔多少 时间。
        Period until = d1.until(d2);
        System.out.println(until);
        long until1 = d1.until(d2, ChronoUnit.MONTHS);
        System.out.println(until1);


        // 日期 是不能与 时间 相比较的。
    }
}
