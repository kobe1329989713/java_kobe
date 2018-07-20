package javase01.cto51.theOldTan03.io.nio;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;

/**
 * @author liukun
 * @version 1.0
 * @date 2018/7/14 19:23
 * @since JDK 1.8
 */
public class ChannelDemo {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("");
        // 把一个流转换成 通道。
        // ReadableByteChannel 它是一个接口哦。
        ReadableByteChannel c1 = Channels.newChannel(fis);

        // 把通道转换成 流。
        InputStream is = Channels.newInputStream(c1);


        // 通过流直接得到一个通道。只读。
        FileChannel c2 = fis.getChannel();
    }
}
