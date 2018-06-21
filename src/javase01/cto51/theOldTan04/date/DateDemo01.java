package javase01.cto51.theOldTan04.date;

import java.util.Calendar;
import java.util.Date;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/03/13/ 0:42 星期二<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class DateDemo01 {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d.getTime());
        // 注：它是一个对象。

        Date d1 = new Date();
        d1.setTime(1520872959549L);

        // 是不是 在d 这个时间之后。
        System.out.println(d.after(d1));


        // 得到一个日历类。它也可以得到 年 月 日 时 分 秒。
        Calendar c = Calendar.getInstance();
        int i = c.get(Calendar.YEAR);
        System.out.println(i);
        System.out.println(c.get(Calendar.MONTH) + 1);
        // 它里面有 很多 日期 相关的常量。  按照套路得到即可。


        // 加 时间。
        System.out.println(
                c.get(Calendar.YEAR)+"年"+(c.get(Calendar.MONTH)+1)+"月"
                +(c.get(Calendar.DATE))
        );
        // 你要加其它 时间时，改变这个 枚举就好。就是加不同的了，如 加年 月 时 秒。。。
        // 减 就是 -7  中哪个枚举位置就好。
        c.add(Calendar.DATE,7);
        System.out.println(
                c.get(Calendar.YEAR)+"年"+(c.get(Calendar.MONTH)+1)+"月"
                        +(c.get(Calendar.DATE))
        );

        // roll() 方法加时间。add() 会智能的进位， roll() 不会。
        c.roll(Calendar.DATE,20);
        System.out.println(
                c.get(Calendar.YEAR)+"年"+(c.get(Calendar.MONTH)+1)+"月"
                        +(c.get(Calendar.DATE))
        );


        // true 就是加 1  false 减 1
        c.roll(Calendar.DATE,true);
        System.out.println(
                c.get(Calendar.YEAR)+"年"+(c.get(Calendar.MONTH)+1)+"月"
                        +(c.get(Calendar.DATE))
        );







    }
}
