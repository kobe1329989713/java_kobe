package Gdish.G005.g01.design014;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/02/05/ 22:43 星期一<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class FutureData implements Data {

    private RealData realData;
    private boolean isReady = false;

    // 它才是会有真实数据的方法。
    public synchronized void setRealData(RealData realData) {
        // 如果已经装载完毕，就直接返回。
        if (isReady) {
            return;
        }

        // 如果没装载，进行装载真实对象。
        this.realData = realData;
        isReady = true;

        // 进行通知。
        notify();
    }


    // 假的
    @Override
    public synchronized String getRequest() {
        // 如果没有装载好 程序就一起处于阻塞状态。
        while (!isReady) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // 装载好直接获取数据即可。
        return this.realData.getRequest();
    }
}
