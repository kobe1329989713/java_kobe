package javase01.cto51.theOldTan03.io.nio.file;

import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

/**
 * @author liukun
 * @version 1.0
 * @date 2018/7/14 20:36
 * @since JDK 1.8
 */
public class FileSysteDemo {
    public static void main(String[] args) throws Exception {
        FileSystem fs = FileSystems.getDefault();
        System.out.println("是否是只读的：" + fs.isReadOnly());
        System.out.println("获取当前系统文件的分隔符：" + fs.getSeparator());

        // 文件的存储
        for (FileStore s : fs.getFileStores()) {
            System.out.println("文件的存储：" + s);
            // 一些以使用的空间，还有多少没有分派。看单词意思。
            // 文件格式。
            System.out.printf(
                    "%s,%s,%s,%s,%s,\n",
                    s.name(),
                    s.getTotalSpace(),
                    s.getUnallocatedSpace(),
                    s.getUsableSpace(),
                    s.type()
            );

        }
        // 得到文件的根目录。
        for (Path p : fs.getRootDirectories()) {
            System.out.println("得到文件的根目录: " + p);
        }
    }
}
