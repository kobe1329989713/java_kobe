package javase01.itcast20.io;

import java.io.File;
import java.io.FileInputStream;

/**
 * @author liukun
 * @version 1.0
 * @date 2018/7/11 20:49
 * @since JDK 1.8
 *
 *
 * 读取一个文件里面的内容。
 */
public class FileInputStreamDemo {
    public static void main(String[] args) throws Exception {
        String path = "C:\\ideaProjects\\space01\\java_kobe\\io\\holle.txt.txt";
        File f = new File(path);
        FileInputStream fis = new FileInputStream(f);
        byte[] bys = new byte[5];
        int read = fis.read(bys);
        System.out.println("read: " + read);
        System.out.println(new String(bys));
        System.out.println("============================");
        int len = 0;
        while ((len = fis.read(bys)) != -1) {
            System.out.print(new String(bys,0,len,"UTF-8"));
//            System.out.print((char) fis.read());
        }

        fis.close();
    }
}
