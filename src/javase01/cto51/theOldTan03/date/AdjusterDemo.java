package javase01.cto51.theOldTan03.date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.*;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/01/15/ 22:17 星期一<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class AdjusterDemo {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        // 找到当前日期的 下一个星期一是哪一天。
        LocalDate d = now.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        System.out.println(d);


        // 这个月的第三个星期二
        LocalDate d2 = now.with(TemporalAdjusters.dayOfWeekInMonth(3, DayOfWeek.TUESDAY));
        System.out.println(d2);

        // d 三个月后 的多少天。
        TemporalAdjuster adjuster = TemporalAdjusters.ofDateAdjuster((LocalDate date) -> date.plusMonths(3).plusDays(2));
        System.out.println(d.with(adjuster));


        TemporalQuery<LocalDate> d5 = TemporalQueries.localDate();
        System.out.println(now.query(d5));


        TemporalQuery<TemporalUnit> dt = TemporalQueries.precision();
        System.out.println(now.query(dt));

        LocalTime nowTime = LocalTime.now();
        System.out.println(nowTime.query(dt));
    }
}
