package javase01.cto51.theOldTan04.date;

import java.time.Duration;
import java.time.Instant;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/03/13/ 22:21 星期二<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class InstantDemo01 {
    public static void main(String[] args) {
        // 它离原点间隔多少毫秒，  1000 到原点的时间 是多少。
        Instant i1 = Instant.ofEpochMilli(1000);
        Instant i2 = Instant.now();
        System.out.println(i1);
        System.out.println(i2);


        // 相隔多少天。时间间隔。
        Duration d1 = Duration.ofDays(3);
        System.out.println(d1);

        Duration d2 = Duration.ofMillis(30);
        System.out.println(d2);


        // 是不是在什么时间之后
        boolean after = i1.isAfter(i2);
        System.out.println(after);








    }

}
