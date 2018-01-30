package Gdish.G005.thread;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/01/25/ 0:05 星期四<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>同一对象属性的修改不会影响的情况。
 *
 *
 *      修改 一个类 对象 属性 是可以的
 *      结合到前面 字符串 当锁时 值，是不能进行修改的。 类的对象 当锁时，对象的属性是可以改变的。
 *      对象的 属性 无论这么变 都不会吃影响到锁的。
 *
 * <BR>
 */
public class ModifyLock {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public synchronized void changeAttrubute(String name, int age) {
        System.out.println("当前线程："+Thread.currentThread().getName()+"开始");
        this.setName(name);
        this.setAge(age);
        System.out.println("当前线程：" + Thread.currentThread().getName() + "修改对象内容为：" + this.getName() + "， " + this.getAge());
        try {
            Thread.sleep(2000);
            System.out.println("当前线程："+Thread.currentThread().getName()+"结束");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        final ModifyLock modifyLock = new ModifyLock();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                modifyLock.changeAttrubute("kobe",22);
            }
        },"t1");
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                modifyLock.changeAttrubute("mar",20);
            }
        },"t2");

        t1.start();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();
    }
}
