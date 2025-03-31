package day08_oop.code;

import java.util.Arrays;

/**
 * 目标： 认识与理解代码块的原理与作用  第一部分 静态代码块
 */
public class CodeDemo1 {
    private static String name;

    private static String[] cards = new String[54];
    // 静态代码块 用static 修饰 所以属于类 静态代码块在类加载的时候自动执行执行 但也执行一次(优先 )
    //基本常用来初始化 静态成员变量
    static {
        System.out.println("静态代码块执行了");
        name = "张三";
        cards[0] = "A";
        cards[1] = "2";
        cards[2] = "3";
        cards[3] = "4";
    }

    public static void main(String[] args) {
        System.out.println("mian 方法执行了");
        System.out.println(name);
        System.out.println(Arrays.toString(cards));
    }
}
