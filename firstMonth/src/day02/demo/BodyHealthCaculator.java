package day02.demo;

import java.util.Scanner;

/**
 * 目标：身体健康计算器
 */
public class BodyHealthCaculator {
    public static void main(String[] args) {
        //1.首先提示用户输入 年龄 性别 体重 身高
        System.out.print("请输入您的年龄：");
        Scanner sc = new Scanner(System.in);
        int age= sc.nextInt();

        System.out.print("请输入您的性别：");
        String sex = sc.next();

        System.out.print("请输入您的体重（kg）：");
        double weight = sc.nextDouble();

        System.out.print("请输入您的身高（m）：");
        double height = sc.nextDouble();

        double bmi = printBMI(weight,height);
        double bmr = printBMR(age,sex,weight,height);
        double bodyFatRate = printBodyFatRate(weight,height,bmi,age,sex);

        System.out.println("===========================");
        System.out.println("经过计算 您的相关数据如下");
        //判断bmi的健康状态
        if (bmi<18.5){
            System.out.println("您的BMI为："+bmi+"，您的身体状态为：过轻");
        }else if (bmi>=18.5&&bmi<24.9){
            System.out.println("您的BMI为："+bmi+"，您的身体状态为：正常");
        }else if (bmi>=24.9&&bmi<27.0){
            System.out.println("您的BMI为："+bmi+"，您的身体状态为：过重");
        }else if (bmi>=27.0&&bmi<30.0){
            System.out.println("您的BMI为："+bmi+"，您的身体状态为：肥胖");
        }else {
            System.out.println("您的BMI为："+bmi+"，您的身体状态为： severely obese");
        }
        System.out.println("您的BMR为："+bmr);
        System.out.println("您的体脂率为："+bodyFatRate + "%");

    }
    //2.定义方法来计算BMI
    public static double printBMI(double weight,double height){
        double bmi = weight/(height*height);
        return bmi;
    }
    //3.定义方法来计算BMR
    public static double printBMR(int age, String sex, double weight, double height) {
        double bmr = 0;
        if (sex.equals("男")) {
            bmr = (10 * weight) + (6.25 * height) - (5 * age) + 5;
        } else if (sex.equals("女")) {
            bmr = (10 * weight) + (6.25 * height) - (5 * age) - 161;
        }
        return bmr;
    }
    //4.定义方法来计算体脂率
    public static double printBodyFatRate(double weight, double height, double bmi, int age, String sex) {
        // 体脂率计算公式（基于 BMI 和年龄）
        double bodyFatRate;
        if (sex.equalsIgnoreCase("男")) {
            bodyFatRate = 1.2 * bmi + 0.23 * age - 16.2;
        } else if (sex.equalsIgnoreCase("女")) {
            bodyFatRate = 1.2 * bmi + 0.23 * age - 5.4;
        } else {
            throw new IllegalArgumentException("性别参数不合法，请输入 '男' 或 '女'");
        }

        // 返回体脂率（范围限制在 0.1 到 0.6 之间）
//        return Math.max(0.1, Math.min(0.6, bodyFatRate));
        return bodyFatRate;
    }
}
