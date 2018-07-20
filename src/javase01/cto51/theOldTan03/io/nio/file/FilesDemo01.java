package javase01.cto51.theOldTan03.io.nio.file;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author liukun
 * @version 1.0
 * @date 2018/7/14 21:28
 * @since JDK 1.8
 *
 * File 的增强版本。
 */
public class FilesDemo01 {
    public static void main(String[] args) throws Exception {
        String path = "C:\\ideaProjects\\space01\\java_kobe\\src" +
                "\\javase01\\cto51\\theOldTan03\\io\\nio\\" +
                "file\\FilesDemo01.txt";
        Path p1 = Paths.get(path);
        // createFile() 如果文件已经存在了你在调用这个方法就会报错。
//        Files.createFile(p1);




        // 创建目录。
        String path1 = "C:\\ideaProjects\\space01\\java_kobe\\src" +
                "\\javase01\\cto51\\theOldTan03\\io\\nio\\" +
                "file\\d1\\";
        Path p2 = Paths.get(path1);
        // createDirectory() 它只能创建一级。多了就会报错。
        Files.createDirectory(p2);
        // createDirectories() 它可以级联创建目录。
//        Files.createDirectories(p2);

        // 看这个 Files 的api 如：它还可以创建临时目录与文件。
    }

}
