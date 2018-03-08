package javase01.cto51.theOldTan03.enum1;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/02/28/ 20:38 星期三<BR>
 *
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>枚举。<BR>
 */
public enum Season02 {
    /**
     * 四季
     */
    // xx() 这样写 ，必须要声明有参的构造 也可以是多个？？和哪些构造一样的。
    SPRING("spring"){
        @Override
        public void m2() {
            System.out.println("枚举里面的抽象方法。");
        }
    },SUMMER {
        @Override
        public void m2() {

        }
    },AUTOMN {
        @Override
        public void m2() {

        }
    },WINTER {
        @Override
        public void m2() {

        }
    };

    // 在枚举里面声明 变量。
    String name;


    public abstract void m2();

    // 在枚举里面 还可以有构造函数。


    // 枚举里面构造的修饰符 只能是 private 的。
    // 只要你用到了 这个枚举的任何一个 实列，构造函数都会执行。
    Season02() {
        System.out.println("枚举构造方法。");
    }

    Season02(String name) {
        this.name = name;
    }

    // 枚举里面声明普通方法。
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static void main(String[] args) {
        // 枚举里面的  ==  和  equals()
        Season02 spring = Season02.SPRING;
        Season02 summer = Season02.SUMMER;
        // 都是false 因为它们都不属于同一个对象。注：是对象。
        System.out.println(spring==summer);
        System.out.println(spring.equals(summer));

        // true ,因为它们都是同一个对象了。
        // 因为枚举 每一个实列 都是 单列的。一样的。
        // 因为都是哪一个对象嘛。所以是true。
        Season02 spring1 = Season02.SPRING;
        System.out.println(spring == spring1);
        System.out.println(spring.equals(spring1));

    }
}
