package Gdish.G005.g01.io.aio;

import java.net.InetSocketAddress;
import java.nio.channels.AsynchronousChannelGroup;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
	//线程池
	private ExecutorService executorService;
	//线程组
	private AsynchronousChannelGroup threadGroup;
	//服务器通道
	public AsynchronousServerSocketChannel assc;
	
	public Server(int port){
		try {
			//创建一个缓存池
			executorService = Executors.newCachedThreadPool();
			//创建线程组
			threadGroup = AsynchronousChannelGroup.withCachedThreadPool(executorService, 1);
			//创建服务器通道
			assc = AsynchronousServerSocketChannel.open(threadGroup);
			//进行绑定
			assc.bind(new InetSocketAddress(port));
			
			System.out.println("server start , port : " + port);
			// 以上这些操作就是 nio 里面的 把client 注册到server端，然后server端轮循所有的 selector 的状态，然后来做具体的事情 的哪些操作。
			// 在aio 里面 这些操作全部给一个线程组去完成。



			//进行阻塞 ServerCompletionHandler() 这个handler 是专门处理每人请求具体需要干什么事情的，然后把结果返回给 client端的线程。
			assc.accept(this, new ServerCompletionHandler());
			//一直阻塞 不让服务器停止
			Thread.sleep(Integer.MAX_VALUE);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Server server = new Server(8765);
	}
	
}
