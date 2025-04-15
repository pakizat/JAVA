package day08_oop.stringdemo;

import java.util.Scanner;

/**
 * 目标 ： 案例练习 开发验证码
 * 实现随机产生验证码，验证码的每一位可能是数字、大写字母、小写字母。
 */

public class Demo2 {
    public static void main(String[] args) {

        System.out.println("请指定验证码位数");
        Scanner sc = new Scanner(System.in);
        System.out.println(getCode(sc.nextInt()));

    }


    //指定位数的随机验证码返回 可以是数字 大写字母 小写字母
    public static String getCode(int n) {
        String code = "";
        String str = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

        //随机按照指定的位数截取
        for(int i = 0; i < n; i++){
            int index = (int)(Math.random()*str.length());
            code += str.substring(index, index + 1);
            //code.append(str.substring(index, index + 1));
            //等效于 code += str.charAt(index);
        }

        return code;
    }
}
