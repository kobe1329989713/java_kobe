package javase01.cto51.theOldTan03.io.nio;

import java.nio.ByteBuffer;

/**
 * @author liukun
 * @version 1.0
 * @date 2018/7/14 17:47
 * @since JDK 1.8
 */
public class BufferDemo {
    public static void main(String[] args) {
        // 创建buffer 对象。因为buffer 是抽象类。所以要用它的子类。所以要用它的工厂方法来得到实例。
        // allocate(10) 就像声明一个数据给的初始长度一样。后面添加数据时，不能超过10个元素。
        // byte 的范围是 -127 ~ 128 所以你在添加数据是 不能超过这个范围的。
        ByteBuffer b1 = ByteBuffer.allocate(10);

        // 通过一个 byte[]数组得到一个 ByteBuffer 对象。有重载。
        ByteBuffer b2 = ByteBuffer.wrap(new byte[]{1,2,3});

        // allocateDirect(10) 它是一个固定大小的。
        // allocateDirect() 它是直接分派(它是在操作系统里面进行分派)
        // allocate(10) 它是在java虚拟机里面进行分派。
        //allocateDirect(10) 是ByteBuffer 特有的。其它XxxBuffer 是没有的。
        ByteBuffer b3 = ByteBuffer.allocateDirect(10);

        // 往buffer 里面 读数据。
        // 你往 limit(5) 就是设置, 这样后面的五个数据你就获取不到了。因为你的容量是10，它把后面的5给忽略掉了。
        int limit = b1.limit();
        // 10 因为你没有设置limit 它默认和容量是一样的。10说明它里面有10个数据。
        System.out.println(limit);

        // 往buffer 写入数据。
        // 可以通过索引添加数据， 也可以不通过直接写。它的位置是会自动+1 的。
        for (int i = 0; i < limit; i++) {
            // put() 没有带索引的它会自动的把位置自增一下。所以下面位置打印一起是10
            b1.put((byte) i);
            // 带有索引的 put(1,1) 方法。
//            b1.put(i, (byte) i);
            // 不带索引，buffer的位置会发生变化。
            // 带有索引，buffer的位置不会变。
        }





        for (int i = 0; i < limit; i++) {
            // 获取b1 这个buffer 每个数据的位置。
            // 位置它会自增，和数组的索引一样。
            System.out.print(b1.position()+" : ");
            // 获取Buffer 里面每一个值。
            // get() 获取当前位置的这个数据。
//            System.out.println(b1.get());

            // 不考虑位置 get() 方法里面也可以传一个索引 如i
            System.out.println(b1.get(i));
        }
    }

}
