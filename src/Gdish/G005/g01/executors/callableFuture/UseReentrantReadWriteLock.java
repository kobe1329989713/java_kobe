package Gdish.G005.g01.executors.callableFuture;


import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/02/08/ 0:33 星期四<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>读写锁，适合在高并下，读多写少的 一个锁。<BR>
 */
@SuppressWarnings("ALL")
public class UseReentrantReadWriteLock {

    private ReentrantReadWriteLock rwLock = new ReentrantReadWriteLock();
    // 读的锁。 就是查询数据
    private ReentrantReadWriteLock.ReadLock readLock = rwLock.readLock();
    // 写的锁。 insert update delete 都是写的操作。
    private ReentrantReadWriteLock.WriteLock writeLock = rwLock.writeLock();
    // 读写分离机制。


    public void read() {
        try {
            readLock.lock();
            System.out.println("当前线程："+Thread.currentThread().getName()+"进入。。");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            readLock.unlock();
        }
    }
    public void write() {
        try {
            writeLock.lock();
            System.out.println("当前线程："+Thread.currentThread().getName()+"进入。。");
            Thread.sleep(3000);
            System.out.println("当前线程："+Thread.currentThread().getName()+"退出。。");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            writeLock.unlock();
        }
    }

    public static void main(String[] args) {
        final UseReentrantReadWriteLock urrw = new UseReentrantReadWriteLock();

        Thread t1 =new Thread(new Runnable() {
            @Override
            public void run() {
                urrw.read();
            }
        },"t1");

        Thread t2 =new Thread(new Runnable() {
            @Override
            public void run() {
                urrw.read();
            }
        },"t2");


        Thread t3 =new Thread(new Runnable() {
            @Override
            public void run() {
                urrw.write();
            }
        },"t3");

//        t1.start();
//        t2.start();

        // R
        t2.start();
        // W
        t3.start();


    }

}
