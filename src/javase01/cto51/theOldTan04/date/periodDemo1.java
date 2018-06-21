package javase01.cto51.theOldTan04.date;

import java.time.Period;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/03/13/ 22:49 星期二<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class periodDemo1 {
    public static void main(String[] args) {
        // 间隔。
        Period p1 = Period.of(1, 2, 20);
        System.out.println(p1);

        Period period = p1.minusDays(12);
        System.out.println(period);
    }
}
