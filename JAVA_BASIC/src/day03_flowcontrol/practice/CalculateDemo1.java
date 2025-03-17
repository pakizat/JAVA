package src.day03_flowcontrol.practice;

import java.util.Scanner;

/**
 * 练习案例： 简单计算器
 * 目标： 设计一个可以执行基本数学运算（加、减、乘、除）的计算程序
 * 功能描述： 用户输入两个数字、一个运算符（+ — * /）
 * 根据所选运算符执行相应数学运算，显示运算结果
 */
public class CalculateDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个数字：");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("请输入运算符：");
        String c = sc.next();
        double result = calculate(a, b, c);
        System.out.println(result);
    }

    //1.定义一个方法实现计算器功能
    public static double calculate(double a, double b, String c) {
        double result = 0;
        switch (c) {
            case "+":
                result = (a + b);
                break;
            case "-":
                result = (a - b);
                break;
            case "*":
                result = (a * b);
                break;
            case "/":
                if (b == 0) {
                    System.out.println("除数不能为0");
                }
                result = (a / b);
                break;
            default:
                System.out.println("运算符错误");
        }
        return result;
    }
}
