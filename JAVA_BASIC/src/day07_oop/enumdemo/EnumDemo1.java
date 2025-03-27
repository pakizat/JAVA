package day07_oop.enumdemo;

/**
 * 目标 ： 认识理解 枚举类
 */
public class EnumDemo1 {
    public static void main(String[] args) {

        A a1 = A.UP;
        A a2 = A.DOWN;
        A a3 = A.LEFT;
        A a4 = A.RIGHT;

        //打印直接显示枚举名称 说明重写了 toString 方法
        //直接打印对象时 默认会调用对象的 toString 方法 所以显示灰色
        System.out.println(a1);//UP
        System.out.println(a1.toString());//UP
        System.out.println(a2);//DOWN 一样
        System.out.println(a2.name());//DOWN 一样

        System.out.println("===========================");
        System.out.println(a1.ordinal());//获取索引从0开始
        System.out.println(a2.ordinal());//获取索引2
        System.out.println(a3.ordinal());//获取索引3
        System.out.println(a4.ordinal());//获取索引4
    }
}
