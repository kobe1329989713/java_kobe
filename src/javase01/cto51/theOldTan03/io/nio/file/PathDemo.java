package javase01.cto51.theOldTan03.io.nio.file;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author liukun
 * @version 1.0
 * @date 2018/7/14 21:04
 * @since JDK 1.8
 */
public class PathDemo {
    public static void main(String[] args) {
        String path = "C:\\ideaProjects\\space01\\" +
                "java_kobe\\src\\javase01\\cto51\\" +
                "theOldTan03\\io\\nio\\file\\f1.txt";

        Path p1 = FileSystems.getDefault().getPath(path);
        System.out.println("p1: " + p1);
        // path 的组成部分，就是这个路径的 根目录，包文件名
        int count = p1.getNameCount();
        System.out.println(count);
        for (int i = 0; i < count; i++) {
            System.out.println(p1.getName(i));
        }
        System.out.println("得到根目录："+p1.getRoot());
        System.out.println("得到父目录："+p1.getParent());
        System.out.println("判断它是否是一个绝对路径: "+p1.isAbsolute());

        // normalize() resolve() 这几个方法它都不会去管你的这个路径是否存在的。
        Path p2 = Paths.get(path);
        // normalize() 它是把路径中带有 . 点的这种路径规范化。它最终得到一个 你绝对访问的到的路径。
//        p2.normalize();

        Path p3 = Paths.get(path);
        // resolve() 它把两个路径 给连接起来。
        System.out.println(p2.resolve(p3));

        Path p4 = Paths.get(path);
        // 看两个路径的相对路径是怎样的。
        p2.relativize(p4);

        // 求一个子路径。
        p2.subpath(1, 3);

        // 还可以判断两个路径 是否相同 是否以什么开头与结尾。
    }
}
