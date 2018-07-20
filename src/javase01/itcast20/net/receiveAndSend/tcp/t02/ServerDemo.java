package javase01.itcast20.net.receiveAndSend.tcp.t02;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author liukun
 * @version 1.0
 * @date 2018/7/13 21:22
 * @since JDK 1.8
 */
public class ServerDemo {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(8888);
        Socket accept = ss.accept();
        InputStream stream = accept.getInputStream();
        byte[] bys = new byte[1024];
        int read = stream.read(bys);

        System.out.println(new String(bys,0,read));

        // 返回client 数据。
        OutputStream outputStream = accept.getOutputStream();
        outputStream.write("server 返回 client 数据".getBytes());
        accept.close();
        ss.accept();
    }
}
