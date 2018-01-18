package javase01.cto51.date;

import java.time.Period;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/01/15/ 21:56 星期一<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class PeriodDemo {
    public static void main(String[] args) {
        Period p1 = Period.of(1, 3, 20);
        System.out.println(p1);

        // 往后面继续加 多少 年 多少天。。秒 或者 往后 减
//        p1.plus()
        System.out.println(p1.minusDays(21));
    }
}
