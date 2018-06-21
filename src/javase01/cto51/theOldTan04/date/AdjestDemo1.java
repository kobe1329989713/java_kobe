package javase01.cto51.theOldTan04.date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.*;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/03/13/ 23:02 星期二<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class AdjestDemo1 {
    public static void main(String[] args) {
        LocalDate t = LocalDate.now();
        System.out.println(t);
        // 下一周的星期一 的时间，  也是 改变哪个枚举枚举单位就可以得到不同的 时间。
        // TemporalAdjusters 它里面有很多方法。
        LocalDate d = t.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        System.out.println(d);


        // 这个月的 第三个 星期二。
        LocalDate d2 = t.with(TemporalAdjusters.dayOfWeekInMonth(3, DayOfWeek.TUESDAY));
        System.out.println(d2);


        TemporalAdjuster adjuster = TemporalAdjusters.ofDateAdjuster(
                (LocalDate data) -> data.plusMonths(3).plusDays(2)
        );
        // 得到当前时间的 3个月 过两个。的时间。
        System.out.println(d.with(adjuster));

        // 看 APi


        TemporalQuery<LocalDate> d5 = TemporalQueries.localDate();
        LocalDate query = t.query(d5);
        System.out.println(query);


        TemporalQuery<TemporalUnit> d6 = TemporalQueries.precision();
        System.out.println(t.query(d6));


    }
}
