package Gdish.G005.g01.design014;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/02/05/ 22:29 星期一<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class Main {
    public static void main(String[] args) {

        FutureClient fc = new FutureClient();
        // 这里面相当于调用存储过程。
        Data data = fc.request("请求参数");
        System.out.println("请求发送成功");

        System.out.println("可以做其它事情了");

        // 什么时候需要用到数据时，在去调用 getRequest() 方法就可以得到 真实的数据了。
        String result = data.getRequest();
        System.out.println(result);


        /**
         *  重点是：它发送一个请求，先返回一个假的数据给你， 然后哪个假的数据 去慢慢的加载 真实数据，
         *      等你需要真实数据时，它就把真实的数据在返回给你。
         *
         *      FutureData 和 RealData 它们两个实现的是同一个接口。
         *      FutureData 是用线程的 wait() 和 notify() 进行阻塞着的 ，它是返回的假数据。
         *      等 FutureData 获取到了真实的数据了，它就不阻塞了。就直接返回真实数据了
         *      RealData 就是加载真实数据的。
         *
         *
         *      cucurent 包下，有Future 的实现。
         */
    }
}
