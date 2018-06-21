package javase01.cto51.theOldTan04.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/03/13/ 23:37 星期二<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class PersonDemo {
    public static void main(String[] args) {
        // 把一个字符串转换成一个 日期。
        String now = "12/16/1214";
        // mm/dd/yyyy 哪里必须要和 你的字符串日期相对应上。才行。
        LocalDate parse = LocalDate.parse(now, DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        System.out.println(parse);


        System.out.println(LocalDate.from(DateTimeFormatter.ofPattern("MM/dd/yyyy").parse(now)));


        System.out.println(
                DateTimeFormatter.ofPattern("MM/dd/yyyy").parse(now,LocalDate::from)
        );




    }
}
