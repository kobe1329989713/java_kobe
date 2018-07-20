package javase01.itcast20.net.receiveAndSend.tcp.t01;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author liukun
 * @version 1.0
 * @date 2018/7/13 20:56
 * @since JDK 1.8
 */
public class ServerDemo {
    public static void main(String[] args) throws Exception {
        ServerSocket s = new ServerSocket(8888);
        Socket accept = s.accept();
        InputStream stream = accept.getInputStream();
        byte[] bys = new byte[1024];
        int read = stream.read(bys);
        System.out.println(new String(bys,0,read));

        accept.close();
    }
}
