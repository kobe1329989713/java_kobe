package patter.patter01.chainOfResponsibility;

/**
 * @author liukun
 * @version 1.0
 * @date 2018/7/15 22:26
 * @since JDK 1.8
 */
public class Test01 {
    public static void main(String[] args) {
        MyHandler h1 = new MyHandler("h1");
        MyHandler h2 = new MyHandler("h2");
        MyHandler h3 = new MyHandler("h3");

        // 它这里 有点递归的味道
        h1.setHandler(h2);
        h2.setHandler(h3);

        h1.operator();
        // kobe
        // 222
        // kobe
   }
}
