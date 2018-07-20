package javase01.itcast20.net.receiveAndSend.tcp.t02;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author liukun
 * @version 1.0
 * @date 2018/7/13 21:19
 * @since JDK 1.8
 *
 *  双向的 client 端 与 server端 相互发送数据。
 */
public class ClientDemo {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("192.168.0.100", 8888);
        OutputStream stream = s.getOutputStream();
        stream.write("双向输入数据".getBytes());
        // 获取server 返回的数据。
        InputStream inputStream = s.getInputStream();
        byte[] bys = new byte[1024];
        int read = inputStream.read(bys);
        System.out.println(new String(bys,0,read));
        s.close();
    }
}
