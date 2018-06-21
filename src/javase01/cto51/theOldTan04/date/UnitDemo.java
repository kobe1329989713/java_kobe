package javase01.cto51.theOldTan04.date;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/03/13/ 22:39 星期二<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class UnitDemo {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        // 加四天。
        LocalDate plus = now.plus(4, ChronoUnit.DAYS);
        System.out.println(plus);


        // 加四个星期。
        LocalDate plus1 = now.plus(4, ChronoUnit.WEEKS);
        System.out.println(plus1);
    }
}
