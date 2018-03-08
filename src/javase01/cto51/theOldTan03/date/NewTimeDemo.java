package javase01.cto51.theOldTan03.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/01/15/ 20:08 星期一<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class NewTimeDemo {
    public static void main(String[] args) {
        // 多数是工厂类 来得到实例。
        LocalDate d = LocalDate.now();
        System.out.println("d得到当前时间："+d);
        //                                    getMonth()
        System.out.println(d.getYear()+","+d.getMonthValue()+", "+ d.getDayOfMonth());


        // 得到时间，和 LocalDate 差不多, 类里面还有很多API
        LocalTime t = LocalTime.now();
        System.out.println(t);


        // 日期和时间 一样。
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);


        LocalDate d1 = LocalDate.of(2012, 12, 3);
        LocalTime t1 = LocalTime.of(12, 30, 30);
        System.out.println(d1);
        System.out.println(t1);
    }
}
