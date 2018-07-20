package javase01.cto51.theOldTan03.io.nio;

import java.nio.ByteBuffer;

/**
 * @author liukun
 * @version 1.0
 * @date 2018/7/14 18:41
 * @since JDK 1.8
 */
public class BufferDemo02 {
    public static void main(String[] args) {
        ByteBuffer b = ByteBuffer.allocate(10);

        // 设置buffer 只读。
//        b = b.asReadOnlyBuffer();
        // 复制buffer
//        b = b.duplicate();
        // 分割buffer，就像是 要tyte[] 数组一部分数据样
        // 分割的参数是 当前的位置 到后面样 百度下。
//        b = b.slice();
        // 将当前buffer 转换成另外一种类型的buffer asXxxBuffer()
        // 大转小  和类型转换一样的。
//        DoubleBuffer d  = b.asIntBuffer();


        for (int i = 1; i <= b.limit(); i++) {
            b.put((byte) i);
        }

        // 把位置又变回成0
        b.position(0);
        System.out.println("获取当前的位置："+b.position());

        // 上面的操作 buffer 的属性为：
        // position 是0 ， 因为你设置了。
        // limit 10 因为你没有设置默认和容量是一样的
        // 容量是 10
        // mark 现在没有 因为你没有设置。

        // 设置limit
        // 你设置limit(5) 就相当于你重新设置了容量样，因为它会默认把索引 5后面的数据全部忽略掉。
        // 你在打印时(获取时get()) 索引5后面的是不会在打印出来了。你也get() 不到索引5 后面的数据了。
        // 这只是它的一个计数规则，而不是真的把数据给清掉了。数据还是在 buffer 里面的。
        b.limit(5);


        // 获取Buffer 里面的数据。
        for (int i = 0; i < b.limit(); i++) {
            System.out.println(b.get());
            // 设置mark(标记)
            if (i == 2) {
                b.mark();
            }
        }
        System.out.println(b.position());
        // 你调用了 reset() 它会把你标记的哪个元素的下标设置成 位置。
        // 如果你没有设置标记就来 reset() 就报错的。
        // 所以 mark() 和 reset() 必须要一起使用才行。
        b.reset();
        System.out.println(b.position());
        System.out.println(b.limit());

        // flip() 设置上界到位置，而将位置设置为0
        b.flip();
        System.out.println(b.position());
        System.out.println(b.limit());









    }
}
