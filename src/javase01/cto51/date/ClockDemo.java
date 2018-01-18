package javase01.cto51.date;

import java.time.Clock;
import java.time.Instant;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/01/15/ 21:51 星期一<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class ClockDemo {
    public static void main(String[] args) {
        // 得到默认时区
        Clock c = Clock.systemDefaultZone();
        System.out.println(c.getZone());

        // 得到时克
        Instant i = c.instant();
        Instant i2 = Instant.now(c);
    }
}
