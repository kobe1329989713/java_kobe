package javase01.cto51.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.TextStyle;
import java.time.temporal.ChronoField;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/01/15/ 22:32 星期一<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class FormatDemo {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(DateTimeFormatter.ISO_DATE.format(now));

        System.out.println(now.format(DateTimeFormatter.ISO_DATE));

        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        System.out.println(f1.format(now));




//        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("yyyy年MM月dd日 hh:mm:ss");
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        System.out.println(f2.format(LocalDateTime.now()));


        DateTimeFormatter f3 = new DateTimeFormatterBuilder().appendValue(ChronoField.YEAR).appendLiteral("年是她的生日").appendText(ChronoField.DAY_OF_WEEK, TextStyle.FULL_STANDALONE).toFormatter();
        LocalDate d = LocalDate.of(2014, 12, 25);
        System.out.println(f3.format(d));
    }
}
