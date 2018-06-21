package javase01.cto51.theOldTan03.annotation.test;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/03/08/ 21:20 星期四<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class TestAnnotation {

    @Test(num = 10)
    public void testAdd() {
        System.out.println("Hello Add");
    }

    @Test(num = 5)
    public void testDiv() {
        System.out.println("Hello Div");
    }
}
