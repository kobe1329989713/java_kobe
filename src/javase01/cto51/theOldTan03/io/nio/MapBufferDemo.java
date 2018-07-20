package javase01.cto51.theOldTan03.io.nio;

import java.io.FileInputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author liukun
 * @version 1.0
 * @date 2018/7/14 19:51
 * @since JDK 1.8
 *
 * java io 操作文件最快的方式。
 * MappedByteBuffer 就是它了。也可以 写 可以写一些基于通道的 文件的(音频/视频/图片) copy
 */
public class MapBufferDemo {
    public static void main(String[] args) throws Exception {
        String path = "C:\\ideaProjects\\space01\\java_kobe\\src\\javase01\\cto51\\theOldTan03\\io\\nio\\f2.txt";
        FileInputStream fis = new FileInputStream(path);
        FileChannel c = fis.getChannel();
        // 通过 FileChannel 得到一个 MappedByteBuffer 对象。
        MappedByteBuffer mbb = c.map(
                FileChannel.MapMode.READ_ONLY,
                0,
                c.size()
        );
        //
        while (mbb.hasRemaining()) {
            System.out.print((char) mbb.get());
        }
        fis.close();
    }
}
