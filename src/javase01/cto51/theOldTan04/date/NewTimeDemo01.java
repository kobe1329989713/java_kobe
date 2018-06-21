package javase01.cto51.theOldTan04.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/03/13/ 1:04 星期二<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class NewTimeDemo01 {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        System.out.println(d);
        System.out.println(d.getYear()+","+d.getMonthValue()+","+d.getDayOfMonth());
        System.out.println(d.toString());

        LocalTime t = LocalTime.now();
        System.out.println(t);
        System.out.println(t.toString());


        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);




        // 得到一个特定时间。
        // 里面有很多 重载方法。
        LocalDate d1 = LocalDate.of(2012, 12, 3);
        // 时间
        // 日期+时间。都有of 方法。














    }
}
