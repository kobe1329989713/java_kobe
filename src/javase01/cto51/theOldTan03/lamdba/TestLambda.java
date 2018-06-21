package javase01.cto51.theOldTan03.lamdba;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/03/09/ 0:37 星期五<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */

@FunctionalInterface
interface divable{

    int div(int num1, int num2);
}

@FunctionalInterface
interface divable2{

    String div(String num2);
}

@FunctionalInterface
interface divable3{

    void div(String num2);
}
@FunctionalInterface
interface divable4{

    void div();
}
@FunctionalInterface
interface divable5{
    // 加了 final 在写 lambda 时 就必须要写类型了
    int div(final String num1, String num2);
}


public class TestLambda {
    public static void main(String[] args) {

        // 用 lambda 表达式写。
        divable b = (int num1, int num2) -> { return num1 + num2; };
        // 可以省略类型的，编译器会自己推断的，因为因为接口里面只有一个方法。
        // 要么都不给类型，要么全部给。不能给一个。
        divable b1 = (num1 , num2) -> { return num1 + num2; };



        // 实现体里 只有一条语句时 return和{} 可以省略掉。
        // 多条语句 return 和{} 就必须老。
        divable c1 = (num1 , num2) -> num1 + num2;






        // 只有一个参数时 类型和() 都是可以省略的。
        divable2 d2 = msg -> {return  msg + "abc"; };



        // 没有返回值时，可以自己输出。
        divable3 d3 = msg -> {
            System.out.println(msg+ "dd");
        };
        // 没有返回值时，可以自己输出。
        divable3 c3 = msg -> System.out.println(msg+ "dd");



        // 没有 返回值 和 参数 的写法，注：没有参数时 () 不能省略。
        divable4 d4 = () -> {
            System.out.println("kobe01");
            // 有{} 可以写多条语句的。
            // {} 这个里面就相当于是 实现类 里面的代码了？？
            System.out.println("mar");
        };


    }
}
