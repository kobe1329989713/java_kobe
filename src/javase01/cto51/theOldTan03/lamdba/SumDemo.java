package javase01.cto51.theOldTan03.lamdba;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/03/09/ 0:03 星期五<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */

// 函数式接口。
@FunctionalInterface
interface pollcy{
    boolean test(int num);
}

public class SumDemo {

    public static int add1(int[] nums,pollcy xx) {
        int r = 0;
        for (int num : nums) {
            r += num;
        }
        return r;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        // lambda 表达式调用。
        int r = add1(nums, (num) -> num % 2 == 0);





        //         == 0   2 4 6
    }

}


