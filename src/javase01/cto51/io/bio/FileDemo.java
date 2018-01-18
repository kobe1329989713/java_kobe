package javase01.cto51.io.bio;

import java.io.File;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/01/15/ 23:27 星期一<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public class FileDemo {
    public static void main(String[] args) throws Exception {
        System.out.println("获取项目的工作目录："+System.getProperty("user.dir"));

        String path = "C:\\ideaProjects\\space01\\java_kobe\\src\\javase01\\cto51\\io\\bio\\dicoretor";
        File f1 = new File(path+"\\f1.txt");
//        System.out.println("判断这个文件是否存在："+f1.exists());
//        System.out.println("// 创建这个文件。"+f1.createNewFile());
//
//
//
//        File f2 = new File(path+"\\test");
//        System.out.println("查看这个目录是否存在："+f2.exists());
//
//
//        // 创建临时文件，这个是由系统到时自动回收掉这个空间。
//        System.out.println("打死系统临时文件路径: "+System.getProperty("java.io.tmpdir"));
//        File ff1 = File.createTempFile(path+"\\aaa", "tmp");
//        System.out.println(ff1.exists());
//
//
//        // 创建目录。
//        System.out.println("创建目录, 只创建一级："+f2.mkdir());
//        File ff2 = new File(path + "\\a\\b\\c\\d");
//        System.out.println("mkdirs() 可以随意创建多少级："+ff2.mkdirs());
//
//        System.out.println("删除："+ff2.delete());
//        File ff3 = new File(path + "\\test");
//        System.out.println("删除："+ff3.delete());
//
//
//        System.out.println("生命名："+f1.renameTo(new File(path+"\\f2.txt")));

        System.out.println("查看文件的大小："+f1.length());


        File[] fs1 = File.listRoots();
        for (File file : fs1) {
            System.out.println("获取所有的根目录："+file.getName());
            System.out.println("得到路径："+file.getPath());
        }


        System.out.println("==============================================================");
        File f4 = new File(path);
        String[] f5 = f4.list();
        for (String s : f5) {
            // 如果要把它下面孙子级哪些都遍历出来，只能用 递归 了。
            System.out.println("得到所有的子文件或者了文件夹，是直接一级，它的孙子级没有找了：" + s);
        }

        System.out.println("判断它是否是文件："+f1.isFile());
        System.out.println("判断它是否是文件夹："+f1.isDirectory());


        // 过滤掉 某些文件或者文件夹。
        File[] files = f4.listFiles(f6 -> f6.getName().endsWith("a"));
        for (File file : files) {
            System.out.println("// 过滤掉 某些文件或者文件夹。" + file.getName());
        }


        // 函数式接口，是里面只有一个方法的接口，就叫函数式接口
    }
}
