package javase01.cto51.io.bio;

import java.io.FileInputStream;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/01/16/ 0:11 星期二<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class InputStreamDemo {
    public static void main(String[] args) {
//        String path = "C:\\ideaProjects\\space01\\java_kobe\\src\\javase01\\cto51\\io\\bio\\dicoretor";
//        FileInputStream fis = new FileInputStream(path + "\\f1.txt");
//        int data = fis.read();
//        byte byteDate;
//        while (data != -1) {
//            byteDate = (byte) data;
//            System.out.print((char) byteDate);
//            data = fis.read();
//        }
//        fis.close();


        // 方式二：
        String path = "C:\\ideaProjects\\space01\\java_kobe\\src\\javase01\\cto51\\io\\bio\\dicoretor";
        // 这种方式，就不用你手动来关闭流了。
        try (FileInputStream fis = new FileInputStream(path + "\\f1.txt")) {

            int data = fis.read();
            byte byteDate;
            while (data != -1) {
                byteDate = (byte) data;
                System.out.print((char) byteDate);
                data = fis.read();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
