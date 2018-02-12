package Gdish.G005.g01.executors.disrupter.base;

import com.lmax.disruptor.EventFactory;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/02/08/ 19:39 星期四<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
// 需要让 disrupter 为我们创建事件，我们同时还声明了一个 EventFactory来实例化Event对象。
public class LongEventEactory implements EventFactory {

    @Override
    public Object newInstance() {
        return new LongEvent();
    }
}
