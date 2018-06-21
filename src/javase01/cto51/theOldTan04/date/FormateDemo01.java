package javase01.cto51.theOldTan04.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.TextStyle;
import java.time.temporal.ChronoField;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/03/13/ 23:16 星期二<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class FormateDemo01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        // 按什么时间格式输出 ，哪个 常量是可以改 的。
        System.out.println(DateTimeFormatter.ISO_DATE.format(now));


        String format = now.format(DateTimeFormatter.ISO_DATE);
        System.out.println(format);


        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        String format1 = f1.format(now);
        System.out.println(format1);


        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        String format2 = f2.format(LocalDateTime.now());
        System.out.println(format2);


        // 得到 2013 的 圣诞节是。星期几。
        DateTimeFormatter f3 = new DateTimeFormatterBuilder()
                .appendText(ChronoField.YEAR)
                .appendLiteral("年的笮节是：")
                .appendText(ChronoField.DAY_OF_WEEK, TextStyle.FULL_STANDALONE)
                .toFormatter();

        LocalDate d = LocalDate.of(2014, 12, 25);
        System.out.println(f3.format(d));
    }
}
