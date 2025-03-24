package day03_flowcontrol.practice;

import java.util.Scanner;

/**
 * GetPrimenumberDemo4 类用于在用户指定的范围内查找并打印所有素数
 */
public class GetPrimenumberDemo4 {
    /**
     * 程序的入口点
     * 提示用户输入范围的起始值和结束值，并检查输入的有效性
     * 然后在这个范围内查找并打印所有的素数
     * @param args 命令行参数
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入范围的起始值和结束值（用空格分隔）：");

        // 检查输入是否为两个整数
        if (!sc.hasNextInt() || !sc.hasNextInt()) {
            System.out.println("输入错误，请输入两个整数！");
            return;
        }

        int start = sc.nextInt();
        int end = sc.nextInt();

        // 检查输入范围是否合理
        if (start < 0 || end < 0 || start > end) {
            System.out.println("输入的范围不合法！");
            return;
        }

        System.out.println(start + " 到 " + end + " 之间的素数有：");
        for (int i = start; i <= end; i++) {
            if (getPrime(i)) {
                System.out.println(i);
            }
        }
    }

    /**
     * 判断一个数是否为素数
     * 素数定义为大于 1 的自然数，并且除了 1 和它本身外，不能被其他自然数整除
     * @param num 待检查的数
     * @return 如果 num 是素数，则返回 true；否则返回 false
     */
    public static boolean getPrime(int num) {
        // 小于 2 的数不是素数
        if (num < 2) {
            return false;
        }
        // 2 是素数
        if (num == 2) {
            return true;
        }
        // 偶数不是素数
        if (num % 2 == 0) {
            return false;
        }
        // 只需检查到平方根即可
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
