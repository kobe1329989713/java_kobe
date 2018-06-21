package javase01.cto51.theOldTan04.big;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/03/15/ 0:08 星期四<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class BigDemo01 {
    public static void main(String[] args) {
//        long l = 12344444444444444444L;
        BigDecimal d1 = new BigDecimal("34623565463453543252345324");
        double v = d1.doubleValue();
        System.out.println(v);
        System.out.println(d1.toString());


        // BigDecimal 除了可以计算大数据外，还可以 设定它的进位规则。
//        BigDecimal d2 = new BigDecimal("12.36",new MathContext(3));
        BigDecimal d2 = new BigDecimal("12.36",new MathContext(3, RoundingMode.HALF_DOWN));
        System.out.println(d2.toPlainString());





        BigDecimal d3 = new BigDecimal("34623565463453543252345324");
        BigDecimal d4 = new BigDecimal("34623565463453543252345324");
        System.out.println(d3.add(d4));
        System.out.println(d3.subtract(d4));
        System.out.println(d3.multiply(d4));
        System.out.println(d3.divide(d4));


    }
}
