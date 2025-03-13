package day03.loop;

import java.util.Scanner;

/**
 * 练习案例： 简单计算器
 * 目标： 设计一个可以执行基本数学运算（加、减、乘、除）的计算程序
 * 功能描述： 用户输入两个数字、一个运算符（+ — * /）
 *          根据所选运算符执行相应数学运算，显示运算结果
 */
public class CalculateDemo7 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入两个数字：");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("请输入运算符：");
            char c = sc.next().charAt(0);
            calculate(a,b,c);
    }

    //1.定义一个方法实现计算器功能
    public static void calculate (int a, int b, char c){
        switch (c){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                if (b == 0){
                    System.out.println("除数不能为0");
                    return;
                }
                System.out.println(a/b);
                break;
            default:
                System.out.println("运算符错误");
        }
    }
}
