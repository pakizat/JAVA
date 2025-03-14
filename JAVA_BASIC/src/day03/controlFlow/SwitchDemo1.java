package day03.controlFlow;

import java.util.Scanner;

/**
 * 熟悉 Switch 的使用 及其语法
 */
public class SwitchDemo1 {
    public static void main(String[] args) {
            demo1();
    }
    public static void demo1(){
        System.out.println("请输入你的专业");
        Scanner sc = new Scanner(System.in);
        String major = sc.next();
        switch (major){
            case "计算机科学与技术":
                System.out.println("计算机专业真棒啊");
                break;
            case "软件工程":
                System.out.println("软件工程专业太棒了");
                break;
            case "网络工程":
                System.out.println("网络工程专业爱死了");
                break;
            case "集成电路":
                System.out.println("学集成电路 那你真是大牛");
                break;
            default:
                System.out.println("没有这个专业完蛋了");
        }
    }
}
