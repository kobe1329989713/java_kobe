package javase01.cto51.theOldTan03.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/01/15/ 22:46 星期一<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class ParseDemo {
    public static void main(String[] args) {
        String now = "12/16/2014";
        System.out.println(LocalDate.parse(now, DateTimeFormatter.ofPattern("MM/dd/yyyy")));


        System.out.println(LocalDate.from(DateTimeFormatter.ofPattern("MM/dd/yyyy").parse(now)));



        System.out.println(DateTimeFormatter.ofPattern("MM/dd/yyyy").parse(now,LocalDate::from));
    }
}
