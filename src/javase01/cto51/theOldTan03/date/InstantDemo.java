package javase01.cto51.theOldTan03.date;

import java.time.Duration;
import java.time.Instant;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/01/15/ 21:29 星期一<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class InstantDemo {
    public static void main(String[] args) {
        Instant i1 = Instant.ofEpochMilli(1000);
        Instant i2 = Instant.now();

        // 两个时间 相差(间距)。
        Duration d1 = Duration.ofDays(3);
        Duration d2 = Duration.ofMillis(30);
        System.out.println(d2);


        // 两个时间谁早。谁晚。
        // i1 是不是 i2 后面。
        System.out.println(i1.isAfter(i2));

    }
}
