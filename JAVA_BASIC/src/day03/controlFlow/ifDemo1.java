package day03.controlFlow;

import java.util.Scanner;

/**
 * 目标 学习理解 if 语句 的基本使用
 */

public class ifDemo1 {
    public static void main(String[] args) {
        demo1();
        demo2();
        demo3();

    }

    public static void demo1() {
        System.out.println("请输入你的考试成绩：");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if (score >= 60 && score <= 100) {
            System.out.println("恭喜通过考试");
        }
        System.out.println("程序结束");
    }
    public static void demo2(){
        System.out.println("请输入你的考试成绩：");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if (score >= 60 && score <= 100) {
            System.out.println("恭喜通过考试");
        } else {
            System.out.println("很遗憾，没有通过考试");
        }
    }
    public static void demo3(){
        System.out.println("请输入你的考试成绩：");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if (score >= 60 && score <= 100) {
            System.out.println("恭喜通过考试");
        } else if (score >= 0 && score < 60) {
            System.out.println("很遗憾，没有通过考试");
        } else {
            System.out.println("输入有误");
        }
    }
}
