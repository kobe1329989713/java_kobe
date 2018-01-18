package javase01.cto51.date;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/01/15/ 21:59 星期一<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>表示两个时间相隔多少天<BR>
 */
public class BetweenDemo {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.of(2013, 12, 1);
        LocalDate d2 = LocalDate.now();
        // 表示两个时间相隔多少天
//        Long days = ChronoUnit.DAYS.between(d1, d2);
        // 相隔多少月，还可以继续改变 枚举
        Long days = ChronoUnit.MONTHS.between(d1, d2);
        System.out.println("表示两个时间相隔多少天: "+days);


        System.out.println(d1.until(d2));
        // 相隔多少月。 多少天 改枚举。
        System.out.println(d1.until(d2,ChronoUnit.MONTHS));


        // 可以把一个 日期 和一个 时间 相比较。 是不能比较的
        LocalTime t = LocalTime.now();
//        long days1 = ChronoUnit.MONTHS.between(d1, t);
//        System.out.println(":::"+days1);
        // 只能日期 和日期，时间和时间进行比较。
        LocalTime t1 = LocalTime.of(22, 10);
        // 相隔多少分钟。
        System.out.println(ChronoUnit.MINUTES.between(t, t1));
    }
}
