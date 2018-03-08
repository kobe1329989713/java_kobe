package javase01.cto51.theOldTan03.enum1;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/02/28/ 22:13 星期三<BR>
 *
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class NestedEnum {
    // 内部枚举。(和内部类一样。)
    enum Gender{
        MALE,FEMALE
    }
}


interface Interface1 {
    void m();
}

// 枚举实现接口。
enum Enum2 implements Interface1 {
    ; // 它是必须的。它前面是写 实列的。 就把它当成一个普通的枚举类是一样的，只不过它只是实现了一个接口而已。

    @Override
    public void m() {

    }
}
