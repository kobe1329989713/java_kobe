package patter.patter01.adapter;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/12/20/ 11:09 星期三<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>
 *
 *      方法适配：重点是在哪个继承，接口可以少一个实现类。
 *      对象适配：组合它，就可以调用它里面的 API 方法了？？
 *      接口适配：
 * <BR>
 */
public class TestAdapter {
    public static void main(String[] args) {
//        ITargetable t1 = new Adapter();
//        t1.method1();
//        t1.method2();


        // 对象适配测试。
        Source source = new Source();
        ITargetable targetable = new Wrappter(source);
        targetable.method1();
        targetable.method2();
    }
}
