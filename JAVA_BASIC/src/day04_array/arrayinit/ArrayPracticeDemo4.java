package src.day04_array.arrayinit;

import java.util.Scanner;

/**
 * 目标 ： 使用班级座位表了解 二维数组
 */
public class ArrayPracticeDemo4 {
    public static void main(String[] args) {
        //静态定义
        //定义一个二维数组 存储班级座位信息
        String[][] seats = {{"张三","李四","蒸馏","我的"},
                            {"张我","李饭","蒸个","我个"},
                            {"张－","李分","蒸假","我看"},
                            {"张去","李库","蒸改","我等"},};
        // 调用遍历打印
         printSeats(seats);


        //动态定义
        String[][] num = new String[4][4];
        generateNum(num);
        printSeats(num);
    }

    //输出座位表方法
    public static void printSeats(String[][] seats) {
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }

    //动态数组的数据写入
    public static void generateNum(String[][] num) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print("请输入作为序号");
                num[i][j] = sc.next();
            }
        }
    }
}
