package javase01.itcast20.net.receiveAndSend.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author liukun
 * @version 1.0
 * @date 2018/7/13 12:00
 * @since JDK 1.8
 *
 *
 * 要先写发送方。启动时。要先启动 接收方。
 * UDP: 一般叫：发送方，接收方。
 * TCP: 一般叫：client端 与 server端
 *
 * 接收方：
 */
public class ReceiveDemo {
    public static void main(String[] args) throws Exception {
        // 第二版。
        DatagramSocket ds = new DatagramSocket(12345);
        byte[] bys = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bys, bys.length);
        ds.receive(dp);

        InetAddress address = dp.getAddress();
        System.out.println(address.getHostName());
        System.out.println(address.getHostAddress());

        String s = new String(dp.getData(), 0, dp.getLength());
        System.out.println(s);

        ds.close();

        // 第一版。
//        DatagramSocket ds = new DatagramSocket(10086);
//        byte[] bys = new byte[1024];
//        int len = bys.length;
//        DatagramPacket dp = new DatagramPacket(bys, len);
//        ds.receive(dp);
//        byte[] data = dp.getData();
//        int len1 = data.length;
//        String s = new String(bys, 0, len);
//        System.out.println("传递过来的数据是 ：" + s);
//
//        // 得到发送方，ip地址，计算机名 等。
//        InetAddress address = dp.getAddress();
//        System.out.println("ip: " + address.getHostName());
//        System.out.println("ip: " + address.getHostAddress());
//
//        ds.close();
    }
}
