package Gdish.G005.g01.io.bio2;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 自定义实现线程池方式。
 */
public class HandlerExecutorPool {

	private ExecutorService executor;
    // HandlerExecutorPool executorPool = new HandlerExecutorPool(50, 1000);
    // maxPoolSize 最大同时可以执行多少个线程。
	public HandlerExecutorPool(int maxPoolSize, int queueSize){
		this.executor = new ThreadPoolExecutor(
		        // 取当前机器 可以开启最大的线程数，在哪个运行环境类里面的 Runtime
				Runtime.getRuntime().availableProcessors(),
				maxPoolSize, 
				120L, 
				TimeUnit.SECONDS,
				// ArrayBlockingQueue 一个有界队列。
				new ArrayBlockingQueue<Runnable>(queueSize));
	}
	
	public void execute(Runnable task){
		this.executor.execute(task);
	}
	
	
	
}
