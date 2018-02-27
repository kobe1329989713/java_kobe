package Gdish.G005.g01.io.netty.helloWorld;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;

/**
 * netty server端 Handler 处理类。
 */
public class ServerHandler  extends ChannelHandlerAdapter {

	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
	
			//do something msg
			ByteBuf buf = (ByteBuf)msg;
			byte[] data = new byte[buf.readableBytes()];
			buf.readBytes(data);
			String request = new String(data, "utf-8");
			System.out.println("Server: " + request);
			//写给客户端
			String response = "我是反馈的信息";
			ctx.writeAndFlush(Unpooled.copiedBuffer("888".getBytes()));
			//.addListener(ChannelFutureListener.CLOSE);
			

	}

	// 出错时执行的方法。
	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
		cause.printStackTrace();
		ctx.close();
	}

}
