package src.day04_array.arrayinit;

import java.util.Scanner;

/**
 * 目标 ： 学习数组的第二种 定义方式 动态定义 即先确定长度 不确定具体内容
 * 需求 ： 假设班级里有 8 个学生 开发一个程序
 *        录入他们的成绩 成绩类型位小数 然后 输出平均分 总分 以及最高最低分
 */
public class ArrayPracticeDemo2 {
    public static void main(String[] args) {
        Double[] scores;
        scores = getScore();
        cacuScores(scores);


    }

    public static Double[] getScore (){
        Double[] scores = new Double[8];
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i < scores.length; i++){
            System.out.println("请输入第" + (i+1) + "位同学的成绩");
            scores[i]= sc.nextDouble();
        }
        return scores;
    }

    public static void cacuScores(Double[] scores){
        double total = scores[0];
        double max = scores[0];
        double min = scores[0];
        for(int i = 1; i < scores.length; i++){
           //1. 计算总成绩 然后计算平均值
            total += scores[i];


           //2. 计算最大值
            if ( scores[i] > max ){
                max = scores[i];

            }
           //3. 计算最小值
            if( scores[i] < min ){
                min = scores[i];


            }

        }
        System.out.println("平均值为：" + total / scores.length);
        System.out.println("最大值为：" + max);
        System.out.println("最小值为：" + min);
    }
}
