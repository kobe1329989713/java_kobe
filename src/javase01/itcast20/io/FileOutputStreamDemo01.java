package javase01.itcast20.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * @author liukun
 * @version 1.0
 * @date 2018/7/11 19:30
 * @since JDK 1.8
 */
public class FileOutputStreamDemo01 {
    public static void main(String[] args) throws Exception {
        String path = "C:\\ideaProjects\\space01\\java_kobe\\io\\holle.txt.txt";





        File f = new File(path);
//        FileOutputStream fos = new FileOutputStream(f);
        OutputStream fos = new FileOutputStream(f);
        fos.write("holle.txt".getBytes());
        fos.write("来个中文了: ".getBytes());
        fos.write(97);
        fos.write("\r\n".getBytes());
        byte[] bys = {97, 98, 99, 100, 101};
        fos.write(bys);

        fos.close();


        // 往一个文件它的后面追加内容。它的构造后面等于true 就是往它的后面进行追加内容。
        FileOutputStream fos1 = new FileOutputStream(f,true);
        // 不加true 它会把哪个文件里面的内容全部清掉，然后在往里面进行加内容。
//        FileOutputStream fos1 = new FileOutputStream(f);
        fos1.write("\r\n".getBytes());
        fos1.write("往一个文件它的后面追加内容。它的构造后面等于true 就是往它的后面进行追加内容。".getBytes());
        fos1.close();

    }
}
