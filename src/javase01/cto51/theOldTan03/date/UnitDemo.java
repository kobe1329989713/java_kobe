package javase01.cto51.theOldTan03.date;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/01/15/ 21:46 星期一<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class UnitDemo {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        // 在当前 这个时间点 加上 4天。 看 api 啊。
        System.out.println(now.plus(4, ChronoUnit.DAYS));
        // 加四周，切换 枚举类就好。
    }
}
