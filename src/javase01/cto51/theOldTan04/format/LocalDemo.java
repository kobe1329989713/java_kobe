package javase01.cto51.theOldTan04.format;

import java.util.Locale;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/03/13/ 23:45 星期二<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class LocalDemo {
    public static void main(String[] args) {
        // 得到系统 默认的 语言环境。
        Locale locale = Locale.getDefault();
        System.out.println(locale);
        // 得到国家。
        System.out.println(locale.getCountry());
        // 得到语言。
        System.out.println(locale.getLanguage());
        // 显示的国家。
        System.out.println(locale.getDisplayCountry());
        // 显示的语言。
        System.out.println(locale.getDisplayLanguage());
        // api 里面还有很多 方法。 它是一个对象。
    }
}
