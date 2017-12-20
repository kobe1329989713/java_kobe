package javaSe01.itcast8;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/12/20/ 14:02 星期三<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>
 * 代码块：
 *  局部代码块：及时回收内存。
 *  构造代码块：调用构造函数时执行。
 *  静态代码块：调用构造函数时执行，只执行一次。
 *      构造代码块和静态代码块：主要用于类初始化时，赋值什么，主要就是类初始化时，需要执行些什么东东。
 *
 *
 *  同步代码块：
 *
 * <BR>
 */
public class CodeChunk {
    // 构造代码块。
    {
        System.out.println("构造代码块，每次执行构造函数时，都会调用一次。");
    }

    // 静态代码一 块。
    static {
        System.out.println("静态代码块，执行构造时执行，只执行一次。");
    }
    public static void main(String[] args) {
        CodeChunk chunk = new CodeChunk();
        CodeChunk chunk2 = new CodeChunk();


        int x = 10;
        System.out.println(x);
        // 局部代码块。
        {
            int a = 5;
            System.out.println(a);
        }


    }
}
