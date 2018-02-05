package Gdish.G005.g01.coll013;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/02/05/ 20:13 星期一<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>DelayQueue 带有延迟的队列。<BR>
 */
public class Wangmin implements Delayed {

    private String name;
    // 身份证。
    private String id;
    // 截止时间。
    private long endTime;
    // 定义时间的工具类。 一个时间单位。
    private TimeUnit timeUnit = TimeUnit.SECONDS;

    // 一个网民。
    public Wangmin(String name, String id, long endTime) {
        this.name = name;
        this.id = id;
        this.endTime = endTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    // 这两个方法是重点。
    // 用来判断是否到了截止时间。
    @Override
    public long getDelay(TimeUnit unit) {
        // endTime 到下机时间。
        return endTime - System.currentTimeMillis();
//        return unit.convert(endTime, TimeUnit.MILLISECONDS) - unit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    // 相互比较排序用。 和java 比较器差不多， w o 是传递进来的元素，this 是当前的元素。
    @Override
    public int compareTo(Delayed o) {
        Wangmin w = (Wangmin) o;
        return this.getDelay(this.timeUnit) - w.getDelay(this.timeUnit) > 0 ? 1 : 0;
    }
}
