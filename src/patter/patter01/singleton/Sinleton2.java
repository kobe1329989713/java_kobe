package patter.patter01.singleton;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/12/18/ 23:39 星期一<BR>
 * <p>
 * <B>系统名称：</B>HelloWord<BR>
 * <B>概要说明：</B>
 *
 * 一个完善的单列类
 *  记住：它的四大步骤。
 *
 * <BR>
 */
public class Sinleton2 {
    // 1
    private Sinleton2() { }

    // 2. 声明一个内部类，来维复单列
    private static class SingletonFactory {
        private static Sinleton2 instance = new Sinleton2();
    }
    // 3。获取实例
    public static Sinleton2 getInstace() {
        return SingletonFactory.instance;
    }

    // 4。如果该对象被 序例化了，这个方法可以保持它序例化前后保持一致。
    public Object readResolve() {
        return getInstace();
    }


    // 还没有搞完，还可以继续优化了，

    // 还有 饱汉式 单列，和 饱汉式 单列了。


}
