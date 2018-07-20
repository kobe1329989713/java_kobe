package javase01.cto51.theOldTan03.io.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author liukun
 * @version 1.0
 * @date 2018/7/14 19:30
 * @since JDK 1.8
 *
 * 通过 FileChannel 类来 操作文件。
 *
 * 可以写一些基于通道的 文件的(音频/视频/图片) copy
 *
 */
public class FileChannelDemo {
    public static void main(String[] args) throws Exception {
        String path = "C:\\ideaProjects\\space01\\java_kobe\\src\\javase01\\cto51\\theOldTan03\\io\\nio\\f2.txt";
//        readFile(path);
        write(path);
    }

    // 使用FileChannel（通道）写数据到文件当中。
    private static void write(String p) throws Exception {
        FileOutputStream fos = new FileOutputStream(p);
        // 得到一个只写的 FileChannel通道。
        FileChannel c = fos.getChannel();
        String text = "使用FileChannel（通道）写数据到文件当中。";
        // 把数据写入到Buffer中。
        ByteBuffer buffer = ByteBuffer.wrap(text.getBytes());
        c.write(buffer);
        fos.close();
    }


    // 使用FileChannel（通道）读取一个txt文件。
    private static void readFile(String path) throws IOException {
        FileInputStream fis = new FileInputStream(path);
        // 通过流得到一个 FileChannel 类。
        FileChannel c = fis.getChannel();

        // 注：通道是把数据写入到Buffer 里面的。
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        // 把通道里面的数据 写入到Buffer 里。
        while (c.read(buffer)>0) {
            buffer.flip();
            while (buffer.hasRemaining()) {
                System.out.print((char) buffer.get());
            }
            buffer.clear();
        }
    }
}
