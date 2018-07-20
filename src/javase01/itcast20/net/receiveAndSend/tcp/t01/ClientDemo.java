package javase01.itcast20.net.receiveAndSend.tcp.t01;

import java.io.OutputStream;
import java.net.Socket;

/**
 * @author liukun
 * @version 1.0
 * @date 2018/7/13 12:29
 * @since JDK 1.8
 */
public class ClientDemo {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("192.168.0.100", 8888);
        OutputStream os = s.getOutputStream();
        os.write("socket 套搠字".getBytes());

        s.close();
    }
}
