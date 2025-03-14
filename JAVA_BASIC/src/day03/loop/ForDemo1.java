package day03.loop;

import java.util.Scanner;

/**
 * 目标 学习理解 for 循环
 */

public class ForDemo1 {
    public static void main(String[] args) {
            demo1();

        System.out.println("================================================");
        Scanner sc = new Scanner(System.in);
        System.out.println("请分别回车输入求和范围（从小到大）");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(sum1(a,b));
    }
    public static void demo1() {
        // for 循环的完整形式
        // for (初始化语句; 条件表达式; 步长表达式) {
        //     循环体
        // }
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        //执行流程首先初始化 i = 0;
        //然后判断条件表达式 i < 10;即 1 < 10;成立 执行循环体 执行完毕后进行迭代 i++; 即 i = 1;
        //然后判断条件表达式 i < 10;即 2 < 10;成立 执行循环体 执行完毕后进行迭代 i++; 即 i = 2;
        //然后判断条件表达式 i < 10;即 3 < 10;成立 执行循环体 执行完毕后进行迭代 i++; 即 i = 3;
        //..............
        //最后 判断条件表达式 i < 10;即 10 ！< 10;不成立  不执行循环体  循环结束，

        //需求 求0-5之间的和

    }

    public static int sum1(int a,int b){
        int sum = 0;
        for(int i = a; i < b+1; i++){
            sum += i;

        }
        return sum;
    }
}
