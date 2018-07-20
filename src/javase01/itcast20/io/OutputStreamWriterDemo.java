package javase01.itcast20.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * @author liukun
 * @version 1.0
 * @date 2018/7/11 22:51
 * @since JDK 1.8
 * 转换流。
 */
public class OutputStreamWriterDemo {
    public static void main(String[] args) throws Exception {
        /**
         * 换行
         */
        String NEW_LINE = System.getProperty("line.separator");
        System.out.println("获取系统换行符号：" + NEW_LINE);





        // 它的copy 文件没有做。
        // BufferedReader 它的一个缓存流(就是它的一个包装类，增加的一个。)

        // 从内存中读取出来。
        String path = "C:\\ideaProjects\\space01\\java_kobe\\io\\box.txt";
        File file = new File(path);
        // 从内存读取出来。
        InputStreamReader isr = new InputStreamReader(new FileInputStream(file),"UTF-8");
        char[] bys = new char[1024];
        int by = 0;
        while ((by = isr.read(bys)) != -1) {
            System.out.println(new String(bys, 0, by));
        }
        isr.close();



        // 写到内存去。
//        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(file),"UTF-8");
        // 因为它本身就是字符流，所以不用转换字节了。就不用调用哪个 .getBytes() 方法了。
//        osw.write("kobe，中国");
//        osw.flush();
//        osw.close();
    }
}
