package javase01.cto51.theOldTan03.io.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

/**
 * @author liukun
 * @version 1.0
 * @date 2018/7/14 20:13
 * @since JDK 1.8
 *
 * transferTo() 和 transferFrom() 它就是对文件 copy 一些比较低层的操作给封装起来了。
 */
public class FileCopyDemo {
    public static void main(String[] args) throws Exception {
        String path = "C:\\ideaProjects\\space01\\java_kobe\\src\\javase01\\cto51\\theOldTan03\\io\\nio\\f2.txt";
        String path_bak = "C:\\ideaProjects\\space01\\java_kobe\\src\\javase01\\cto51\\theOldTan03\\io\\nio\\f2_bak.txt";
        try (
                FileChannel src = new FileInputStream(path).getChannel();
                FileChannel des = new FileOutputStream(path_bak).getChannel();
        ) {
            // 开始copy  0全部copy  2参数是：文件大小。3参数是：目录地(copy到哪里去)
//            src.transferTo(
//                    0,
//                    src.size(),
//                    des
//            );

            // 使用 transferFrom() 方法来copy文件。
            des.transferFrom(src, 0, src.size());


            // transferFrom() 与 transferTo() 它们的区别。
            // 就是 操作的源不一样。看代码。
        }

    }
}
