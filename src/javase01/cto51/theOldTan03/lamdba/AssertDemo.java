package javase01.cto51.theOldTan03.lamdba;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/03/11/ 23:35 星期日<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class AssertDemo {
    public static void main(String[] args) {
        int num = 20;
//        assert num == 10;
        assert num == 10 : "还可以给一个描述，num不等于10 请检查参数。num=" + num;
        System.out.println("和if 样，条件成立就继续往下面执行。前提是你必须启用了java的断言才行。");

        // 启用断言 -ea
    }
}
