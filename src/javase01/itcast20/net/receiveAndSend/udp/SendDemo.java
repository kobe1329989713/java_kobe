package javase01.itcast20.net.receiveAndSend.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author liukun
 * @version 1.0
 * @date 2018/7/13 11:43
 * @since JDK 1.8
 *
 *
 *
 * 发送方
 * 发送时，必须要准备发送的数据，和数据的长度。
 * XxxSocket: 发送 和 接收都是它。
 * XxxSocket 发送 的是一个数据包(DatagramPacket)
 */
public class SendDemo {
    public static void main(String[] args) throws Exception {

        // 第二版。
        DatagramSocket ds = new DatagramSocket();
        byte[] bys = "hello world".getBytes();
        DatagramPacket dp = new DatagramPacket(
                bys,
                bys.length,
                InetAddress.getByName("192.168.0.100"),
                12345
        );
        ds.send(dp);
        ds.close();





        // 第一版本。
//        // 准备发送的数据。
//        DatagramSocket ds = new DatagramSocket();
//        byte[] bys = "hello，udp。我来了 222".getBytes();
//        int len = bys.length;
//        // 发送给谁。
//        InetAddress address = InetAddress.getByName("192.168.0.100");
//        int port = 10086;
//
//        // 把发送的数据，打包是一个包。
//        DatagramPacket dp = new DatagramPacket(bys, len, address, port);
//
//        // 开始发送并关闭
//        ds.send(dp);
//        ds.close();
    }
}





































