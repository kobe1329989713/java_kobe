package javase01.itcast20.io;

/**
 * @author liukun
 * @version 1.0
 * @date 2018/7/11 22:07
 * @since JDK 1.8
 */
public class BufferedOutputStreamDemo {
    public static void main(String[] args) throws Exception {
        // 使用 BufferedInputStream 来 copy 文件。没有做。



        // 使用 BufferedInputStream 来读出文件，把它读取到内存里面，在打印在控制台上。
//        String path = "C:\\ideaProjects\\space01\\java_kobe\\io\\box.txt";
//        File file = new File(path);
//        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
//        byte[] bys = new byte[1024];
//        int by = 0;
//        while ((by = bis.read(bys)) != -1) {
//            System.out.println(new String(bys, 0, by));
//        }



        // 使用 BufferedOutputStream 写入数据到内存去。
        // 1. 用了 OutXXx 的这种做了几个事情。
        // 1. 调用系统功能来创建了文件。
//        String path = "C:\\ideaProjects\\space01\\java_kobe\\io\\box.txt";
//        File file = new File(path);
//        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file));
//        bos.write("学习到 BufferedOutputStream 是一个缓存的流，就是用了装饰者模式的".getBytes());
//        bos.write("\r\n".getBytes());
//        bos.write("在来写一个东东。".getBytes());
//        bos.flush();
//        bos.close();
    }
}
