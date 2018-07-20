package javase01.itcast20.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author liukun
 * @version 1.0
 * @date 2018/7/11 21:11
 * @since JDK 1.8
 */
public class StringDemo01 {
    public static void main(String[] args) throws Exception {
        // copy 文件。
        String path = "C:\\ideaProjects\\space01\\java_kobe\\io\\holle.txt";
        String writePath = "C:\\ideaProjects\\space01\\java_kobe\\io\\holle01.txt";
        File f = new File(path);
        File writeFile = new File(writePath);
        FileInputStream fis = new FileInputStream(f);
        FileOutputStream fos = new FileOutputStream(writeFile);
        byte[] bys = new byte[1024];
        int by = 0;

//        int read = fis.read(bys);
//        System.out.println(new String(bys));


        while ((by = fis.read(bys)) != -1) {
            System.out.print(new String(bys,0,by));
            fos.write(bys);
        }
        fis.close();
        fos.close();

//        String s = "abcdefg";
//        String s = "我爱你中国";
//        byte[] bytes = s.getBytes();
//        System.out.println(Arrays.toString(bytes));
    }
}
