package Gdish.G005.g01.coll013;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/01/31/ 23:48 星期三<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>ConcurrentMap 的使用。<BR>
 */
public class UseConcurrentMap {
    public static void main(String[] args) {
        // 和 map 的用法很类似。可能有一些特别的 api 方法。
        ConcurrentMap<String, Object> chm = new ConcurrentHashMap<>();
        chm.put("k1", "V1");
        chm.put("k2", "V2");
        chm.put("k3", "V3");
        // putIfAbsent() 方法是：如果之前已经加入了 k4 这个元素，哪么现在这个 k4 就加入不了。
        chm.putIfAbsent("K4", "Vvvv");

        System.out.println(chm.get("k2"));
        System.out.println(chm.size());

        for (Map.Entry<String, Object> entry : chm.entrySet()) {
            System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
        }
    }
}
