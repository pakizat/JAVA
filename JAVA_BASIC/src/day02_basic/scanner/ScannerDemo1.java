package day02_basic.scanner;

import java.util.Scanner;

/**
 * 目标： 学习使用scanner组件
 */
public class ScannerDemo1 {
    public static void main(String[] args) {
                demo1();
    }

    public static void demo1(){
        // 1.导包
        //import java.util.Scanner;

        // 2.创建Scanner对象
        Scanner sc = new Scanner(System.in);

        // 3.调用next方法获取用户输入的内容
        System.out.println("请输入名称");
        String name = sc.next();



        // 4.调用nextInt方法获取用户输入的内容
        System.out.println("请输入年龄");
        int age = sc.nextInt();

        System.out.println("=================================================================");

        // 5.将输入内容打印出来
        System.out.println(name);
        System.out.println(age);
    }
}
