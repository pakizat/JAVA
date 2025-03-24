package day03_flowcontrol.practice;

import java.util.Scanner;

/**
 * 综合案例 ： 猜字游戏
 * 要求： 生成一个介于1-100之间的数字 猜测过大过小都有相关提示，知道猜中游戏结束
 */
public class GuessGameDemo2 {
    public static void main(String[] args) {
        guessGame();

    }

    //1. 猜字游戏
    public static void guessGame() {
        System.out.println("猜字游戏开始，请输入一个输作为你的猜测结果");
        int answer = (int) (Math.random() * 100) + 1;
        boolean flag = true;
        while (flag) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            if( a > answer ){
                System.out.println("猜的比答案大哦！！");
            } else if ( a < answer) {
                System.out.println("猜的比答案小哦！！");
            }else{
                flag = false;
                System.out.println("恭喜你，猜测正确！！\n游戏结束");
            }

        }
    }
}
