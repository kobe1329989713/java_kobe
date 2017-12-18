package patter.patter01.singleton;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/12/18/ 23:16 星期一<BR>
 * <p>
 * <B>系统名称：</B>HelloWord<BR>
 * <B>概要说明：</B>HelloWord<BR>
 */
public class Singloten {
    public static Singloten instance;

    private Singloten() { }

//    public static Singloten getInstance() {
//        if (instance == null) {
//            instance = new Singloten();
//        }
//        return instance;
//    }


    // 在多线程里面保证 单例 加 synchronized，这样性能不好。改进版本，如下:
//    public static synchronized Singloten getInstance() {
//        if (instance == null) {
//            instance = new Singloten();
//        }
//        return instance;
//    }


    // 改进版本。这样也有性能问题，在次改进，如下：
//    public static Singloten getInstance() {
//        if (instance == null) {
//            synchronized (instance) {
//                if (instance == null) {
//                    instance = new Singloten();
//                }
//            }
//        }
//        return instance;
//    }


    // 改进版本。
    public static class SingletonFactory {
        private static Singloten instance;
    }

    public static Singloten getInstance() {
        return SingletonFactory.instance;
    }



    // 如果该对象被序例化了，这个方法可以保证该对象在序例化前后保持一致。
    public Object readResolve() {
        return instance;
    }
}
