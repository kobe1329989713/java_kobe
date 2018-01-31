package Gdish.G005.g01.coll013;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/01/31/ 23:41 星期三<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>CopyOnWrite 窗口使用。<BR>
 */
public class UseCopyOnWrite {
    public static void main(String[] args) {
        // 当成集合使用就好，之前怎么使用 List 的就是可以 怎么使用它们了。
        CopyOnWriteArrayList<String> cwal = new CopyOnWriteArrayList<>();
        CopyOnWriteArraySet<String> cwas = new CopyOnWriteArraySet<>();


//        cwal.add()
    }
}
