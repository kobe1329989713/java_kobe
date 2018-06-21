package javase01.cto51.theOldTan04.date;

import java.time.LocalDate;
import java.time.Month;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/03/13/ 22:32 星期二<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class MonthDemo01 {
    public static void main(String[] args) {
        // 表示 10月。
        Month m = Month.OCTOBER;

        LocalDate d = LocalDate.of(2013, m, 12);
        System.out.println(d);

        Month m1 = Month.of(10);
        System.out.println(m == m1);
        // 加月。
        Month plus = m1.plus(1);
        System.out.println(plus);
        System.out.println(plus.getValue());

        System.out.println(Month.from(d).getValue());

    }
}
