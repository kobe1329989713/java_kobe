package javase01.itcast20.net;

import java.net.InetAddress;

/**
 * @author liukun
 * @version 1.0
 * @date 2018/7/13 11:32
 * @since JDK 1.8
 */
public class InetAddressDemo {
    public static void main(String[] args) throws Exception {
        // 通过ip地址得到。
//        InetAddress id = InetAddress.getByName("192.168.0.100");
        // 通过计算机名得到
        InetAddress id = InetAddress.getByName("LAPTOP-VIMSS3AJ");
        System.out.println(id);
        // 通过ip地址得到计算机名。
        System.out.println(id.getHostName());
        // 通过计算机名得到ip地址。
        System.out.println(id.getHostAddress());
    }
}
