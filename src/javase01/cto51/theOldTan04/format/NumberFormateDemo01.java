package javase01.cto51.theOldTan04.format;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/03/14/ 23:45 星期三<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class NumberFormateDemo01 {
    public static void main(String[] args) {
//        NumberFormat f1 = NumberFormat.getCurrencyInstance(Locale.getDefault());
//        NumberFormat f1 = NumberFormat.getCurrencyInstance(Locale.FRENCH);
        NumberFormat f1 = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(f1.format(123434654654634L));


//        f1 = NumberFormat.getCurrencyInstance();
        f1 = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
        String format = f1.format(123456789);
        System.out.println(format);


        DecimalFormat f2 = new DecimalFormat("##.##");
        String format1 = f2.format(1232.4343);
        System.out.println(format1);


    }
}
