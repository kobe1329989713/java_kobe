package Gdish.G005.g01.conn008;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/01/31/ 1:09 星期三<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>内部类方式 实现单例模式。
 *      这种方法在 多线程 环境使用最好，在多线程环境必须使用这种方式，
 *
 *
 * <BR>
 */
public class InnerSingleton {
    private static class Singletion{
        private static Singletion single = new Singletion();
    }

    // 我在调用这个方法时，都去加载 哪个内部类，肯定就只有一个实现呢。最安全的一种解决方案。
    public static Singletion getInstance() {
        return Singletion.single;
    }
}
