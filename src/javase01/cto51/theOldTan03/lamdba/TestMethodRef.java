package javase01.cto51.theOldTan03.lamdba;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/03/11/ 22:51 星期日<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
@FunctionalInterface
interface Toint<T>{
    int conver(T t);
}


public class TestMethodRef {
    public static void main(String[] args) {
//        Toint<String> t1 = s -> s.length();
//        System.out.println("xx: "+t1.conver("TOm"));


        // 方法引用。
        Toint<String> t1 = Integer::parseInt;
        System.out.println("xx: "+t1.conver("123"));


        Supplier<Integer> s1 = "jack"::length;
        System.out.println(s1.get());

        Consumer<String> s2 = System.out::print;


        Function<String,Integer> f1 = String::length;
        System.out.println(f1.apply("Rose and jack"));


        Son son = new Son();
        son.m();


        // 方法引用 之调用构造方法。
        Supplier<Son> son1 = Son::new;
        Son s = son1.get();

        Function<String,Son> fun1 = Son::new;
        Son son2 = fun1.apply("强敌们");


        // 方法引用 之数组。
        Function<Integer,int[]> fun2 = int[]::new;
        int[] nums = fun2.apply(5);
    }
}

class Parent{
    private String name = "张三";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Son extends Parent{
    private String name = "张四";

    public String getName() {
        return name;
    }

    public Son() {
    }

    public Son(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void m() {
        Supplier<String> s1 = this::getName;
        Supplier<String> s2 = Son.super::getName;
        System.out.println(s1.get());
        System.out.println(s2.get());
    }
}
