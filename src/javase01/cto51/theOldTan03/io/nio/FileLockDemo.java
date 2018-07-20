package javase01.cto51.theOldTan03.io.nio;

import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/**
 * @author liukun
 * @version 1.0
 * @date 2018/7/14 20:01
 * @since JDK 1.8
 *
 * 用于锁定文件的 锁。
 */
public class FileLockDemo {
    public static void main(String[] args) throws Exception {
        String path = "C:\\ideaProjects\\space01\\java_kobe\\src\\javase01\\cto51\\theOldTan03\\io\\nio\\f2.txt";
        // RandomAccessFile 它是一个 即可读也可写的文件流。
        RandomAccessFile r = new RandomAccessFile(path, "rw");
        FileChannel c = r.getChannel();


        // 加锁。这里面默认获取到的是一个 排它锁。
//        FileLock lock = c.lock();

        // 共享锁，别个程序可以打开这个文件。但是 不能进行修改。
        FileLock lock = c.lock(
                0,
                c.size(),
                true
        );
        Thread.sleep(9000);
        // 释放锁。也能直接关闭通道。release() 最好。
        lock.release();
    }
}
