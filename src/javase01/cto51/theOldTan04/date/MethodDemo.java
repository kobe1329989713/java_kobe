package javase01.cto51.theOldTan04.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/03/13/ 1:13 星期二<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class MethodDemo {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.of(2014, 12, 25);
        LocalDate d2 = LocalDate.of(2014, Month.JANUARY, 25);
        System.out.println(d1);
        System.out.println(d2);


        LocalDateTime t1 = LocalDateTime.of(2013, 1, 3, 11, 57);
        // form() 只得到 日期。
        LocalDate from = LocalDate.from(t1);
        System.out.println(from);


        // withXxx() 方法改变 某个 时间的  某个值。
//        LocalDate d3 = d1.withYear(2017);
        // 支持链式调用。
        LocalDate d3 = d1.withYear(2017).withMonth(3);
        System.out.println(d3);


        // 得到一个时间 某个值，也支持链式调用。
        System.out.println(d2.getYear());


        // d2 相对某个时间 相离多少天。默认是 1970 的哪个基数数据。
        long days = d2.toEpochDay();
        System.out.println(days);


        // 得到某个时间  的时间，就是只得到 时间。
        LocalTime t2 = t1.toLocalTime();


        // 在某个时间上 加一个时间。
        LocalDateTime t3 = d2.atTime(13, 25);
        System.out.println(t3);


        // 得到某个时间 的开始时间。
        System.out.println(d2);
        LocalDateTime dateTime = d2.atStartOfDay();
        System.out.println(dateTime);





        // 时间 加 减。
        System.out.println(d2);
        // 加一天。 负数 就是 减 多少时间。
        // 还可以传一个时间单位。
        LocalDate localDate = d2.plusDays(5);
        System.out.println(localDate);


        // 减一个 时间。
        System.out.println(d2.minusMonths(-1));

        // 以上 方法都有 重载。看方法参数 知意。





    }
}
