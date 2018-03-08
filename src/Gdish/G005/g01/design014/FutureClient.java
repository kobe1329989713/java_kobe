package Gdish.G005.g01.design014;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/02/05/ 22:36 星期一<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class FutureClient {
    public Data request(final String queryStr) {
        // 我想要一个代理对象（Data接口的实现类）先返回给发送请求的客户端。告拆他请求已经接收到，可以做其它事情
        // 这是一个假的对象，然后直接就返回这个 假的对象 出去了
//        final FutureData futureData = new FutureData();
//
//        // 2。启动一个新的线程，去加载真实的数据，传递给这个代理对象。
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                // 3。这个新的线程可以去慢慢的加载真实数据，然后传递给代理对象。
//                RealData realData = new RealData(queryStr);
//                // 在把真实的数据 设置进哪个假的对象里面去。它就变成了真的数据了。
//                futureData.setRealData(realData);
//            }
//        }).start();

        // 先返回一个假的数据在说， 然后假的里面开户一个线程 去加载 真实的 数据。
//        return futureData;

        return null;
    }
}
