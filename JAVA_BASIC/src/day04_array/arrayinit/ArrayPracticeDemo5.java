package src.day04_array.arrayinit;

import java.util.Scanner;

/**
 *  目标 ： 使用二维数组 完成 综合案例 石头迷阵游戏
 */
public class ArrayPracticeDemo5 {
    public static void main(String[] args) {
    //1.根据输入初始化数组
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择难度 难度 3 起步");
        int level = sc.nextInt();
        //得到初始化的数组
        int[][] arr1 = createArr(level);
        //得到打乱的数组
        int[][] arr2 = breakArr(arr1);
    }
    
    //1.初始化数组函数
    public static int[][] createArr(int level) {
        int[][] arr = new int[level][level];
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = count++;
            }
            
        }
        System.out.println("数组初始化完成");
        printArr(arr);
        return arr;
    }
    //2.打印数组函数
    public static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    //3.打乱数组顺序函数
    public static int[][] breakArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                // 随机选择另一个位置
                int randomRow = (int) (Math.random() * arr.length);
                int randomCol = (int) (Math.random() * arr[randomRow].length);

                // 交换当前元素和随机位置的元素
                int temp = arr[i][j];
                arr[i][j] = arr[randomRow][randomCol];
                arr[randomRow][randomCol] = temp;
            }
        }
        System.out.println("数组打乱完成");
        printArr(arr);
        return arr;
    }

}
