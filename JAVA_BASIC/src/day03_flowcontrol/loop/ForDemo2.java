package src.day03_flowcontrol.loop;

import java.util.Scanner;

/**
 * 使用for 循环 选择出 一定范围内的 奇偶数
 */
public class ForDemo2 {
    public static void main(String[] args) {
        System.out.println("请输入 1 或 2 挑出 奇数或偶数");
        Scanner sc = new Scanner(System.in);
        int flag = sc.nextInt();
        System.out.println("请分别输入 取值范围");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a < b) {
            if (flag == 1) {
                oddNum(a, b);
            } else if (flag == 2) {
                evenNum(a, b);
            } else {
                System.out.println("输入有误 程序退出");
            }
        }else{
            System.out.println("输入有误 程序退出");
        }
    }

    //1.挑出范围内的奇数
    public static void oddNum(int a, int b) {
        int c = 0;
        if (a % 2 == 1) {
            c = a;
        } else {
            c = a + 1;
        }
        for (int d = c; d <= b; d += 2) {
            System.out.println(d);
        }

    }
    public static void evenNum(int a, int b) {
        int c = 0;
        if (a % 2 == 0) {
            c = a;
        } else {
            c = a + 1;
        }
        for (int d = c; d <= b; d += 2) {
            System.out.println(d);
        }

    }
}
