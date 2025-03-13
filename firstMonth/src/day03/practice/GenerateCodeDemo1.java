package day03.practice;

import java.util.Scanner;

/**
 * 综合案例 ： 验证码生成器
 *  目标 ： 可以按指定位数 生成 包含数字或大小写字母的验证码
 */
public class GenerateCodeDemo1 {
    public static void main(String[] args) {
        //1.方法调用
        System.out.println("请输入需要的验证码位数");
        Scanner sc = new Scanner(System.in);
        System.out.println(generateCode(sc.nextInt()));

    }

    //1.程序方法实现
    public static String generateCode(int length) {
        String code = "";




        return code;
    }
}
