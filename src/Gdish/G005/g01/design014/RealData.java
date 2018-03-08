package Gdish.G005.g01.design014;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/02/05/ 22:51 星期一<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class RealData implements Data {
    @Override
    public String getRequest() {
        return null;
    }

//    private String result;
//
//    public RealData(String queryStr) {
//        System.out.println("根据"+queryStr+"进行数据查询，这是一个很耗时的操作。");
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("操作完毕，获取结果");
//        result = "查询结果";
//    }
//
//    @Override
//    public String getRequest() {
//        return result;
//    }
}
