package javase01.cto51.theOldTan04.date;

import java.time.Clock;
import java.time.Instant;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/03/13/ 22:42 星期二<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class ClockDemo01 {
    public static void main(String[] args) {
        // 得到一个默认时区。
        Clock c = Clock.systemDefaultZone();
        System.out.println(c.getZone());


        // 得到 c 这个时区的 时间。
        Instant i = c.instant();
        System.out.println(i);
        Instant i1 = Instant.now(c);
        System.out.println(i1);
    }
}
