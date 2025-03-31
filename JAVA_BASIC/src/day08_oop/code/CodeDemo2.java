package day08_oop.code;

import java.time.LocalTime;

/**
 *  目标 ： 学习与理解 实例代码块 的作用
 */
public class CodeDemo2 {
    private String name;
    private LocalTime time;


    //实例代码块 属于对象 每次创建对象时 都会优先执行一次
    //基本作用： 初始化 对象的 实例资源
    {
        System.out.println("实例代码块");
        name = "小明";
        time = LocalTime.now();
    }
    public static void main(String[] args) {
        System.out.println("main 方法执行了");
        CodeDemo2 a1 = new CodeDemo2();
        System.out.println(a1.time);
        //等待一秒钟
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        CodeDemo2 a2 =new CodeDemo2();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(a2.time);
        CodeDemo2 a3 =new CodeDemo2();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(a3.time);
        CodeDemo2 a4 =new CodeDemo2();
        System.out.println(a4.time);



    }
}
