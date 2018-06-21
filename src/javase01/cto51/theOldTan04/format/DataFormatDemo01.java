package javase01.cto51.theOldTan04.format;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/03/14/ 23:40 星期三<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class DataFormatDemo01 {
    public static void main(String[] args) {
//        DateFormat f1 = DateFormat.getDateInstance(DateFormat.LONG, Locale.CHINESE);
//        DateFormat f1 = DateFormat.getDateInstance(DateFormat.DEFAULT, Locale.CHINESE);
//        DateFormat f1 = DateFormat.getDateInstance(DateFormat.SHORT, Locale.CHINESE);
        DateFormat f1 = DateFormat.getDateInstance(DateFormat.SHORT, Locale.US);
        String format = f1.format(new Date());
        System.out.println(format);


        SimpleDateFormat f2 = new SimpleDateFormat("yyyy/MM/dd");
        f2.applyPattern("MM-dd-yyyy");
        System.out.println(f2.format(new Date()));

    }
}
