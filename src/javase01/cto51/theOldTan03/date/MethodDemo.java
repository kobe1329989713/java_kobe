package javase01.cto51.theOldTan03.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/01/15/ 20:26 星期一<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class MethodDemo {
    public static void main(String[] args) {
        // 一个日期实例。
        LocalDate d1 = LocalDate.of(2014, 12, 25);
                                    // 月这里面必须要用枚举才行
//        LocalDate d1 = LocalDate.of(2014, Month.JANUARY, 25);
        System.out.println(d1);


        // 根据日期与时间，只获取日期 或者是时间。
        LocalDateTime t1 = LocalDateTime.of(2013, 1, 3, 11, 57);
        System.out.println(LocalDate.from(t1));
        System.out.println(t1);


        // 改 年 或者 日  。。。或 秒
//        LocalDate d2 = d1.withYear(2015);
        LocalDate d2 = d1.withYear(2015).withMonth(3);
        System.out.println(d2);


        // 得到一个 年 或者。。。到秒
        System.out.println(d2.getYear());
        System.out.println(d2.getMonthValue());
        System.out.println(d2.getMonth().getValue());

        // 从时间的基准时间 到 d2 哪个时间相隔多少天
        long days = d2.toEpochDay();
        System.out.println(days);

        // 只得 t1 的时间。
        LocalTime t2 = t1.toLocalTime();
        System.out.println("t2: "+t2);


        // 在一个时间点上 加上 另一个时间。
        LocalDateTime t3 = d2.atTime(13, 25);
        System.out.println(t3);

        // 返回一个时间的开始时间。
        System.out.println(d2.atStartOfDay());





        // 在一个时间点上，加一个时间或者减去一个时间。
        System.out.println(d2);
        // 在 d2 后 加五天。
        System.out.println(d2.plusDays(5));
        System.out.println(d2.minusMonths(-1));


    }
}
