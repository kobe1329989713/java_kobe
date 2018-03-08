package Gdish.G005.g01.io.netty.bhz.netty.serial;

public class Server {

//	public static void main(String[] args) throws Exception{
//
//		EventLoopGroup pGroup = new NioEventLoopGroup();
//		EventLoopGroup cGroup = new NioEventLoopGroup();
//
//		ServerBootstrap b = new ServerBootstrap();
//		b.group(pGroup, cGroup)
//		 .channel(NioServerSocketChannel.class)
//		 .option(ChannelOption.SO_BACKLOG, 1024)
//		 //设置日志
//		 .handler(new LoggingHandler(LogLevel.INFO))
//		 .childHandler(new ChannelInitializer<SocketChannel>() {
//			protected void initChannel(SocketChannel sc) throws Exception {
//				sc.pipeline().addLast(MarshallingCodeCFactory.buildMarshallingDecoder());
//				sc.pipeline().addLast(MarshallingCodeCFactory.buildMarshallingEncoder());
//				sc.pipeline().addLast(new ServerHandler());
//			}
//		});
//
//		ChannelFuture cf = b.bind(8765).sync();
//
//		cf.channel().closeFuture().sync();
//		pGroup.shutdownGracefully();
//		cGroup.shutdownGracefully();
//
//	}
}
