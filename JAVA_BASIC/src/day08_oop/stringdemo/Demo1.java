package day08_oop.stringdemo;

import java.util.Scanner;

/**
 * 目标 ： 掌握创建字符串对象，封装要处理的字符串数据，调用String提供的方法处理字符串
 */
public class Demo1 {
    public static void main(String[] args) {
        //1.推荐方法 直接使用""创建字符串对象，封装字符串数据
        String str = "hello world";
        System.out.println(str);
        //取字符串的长度
        System.out.println(str.length());//处理字符串的方法

        //2、方式二：使用new关键字创建字符串对象，封装字符串数据
        String str2 = new String();//不推荐
        System.out.println(str2);//""空字符串

        String str3 = new String("hello world");//不推荐
        System.out.println(str3);

        char[] chars = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};
        String str4 = new String(chars);
        System.out.println(str4);

        byte[] bytes = {104, 101, 108, 108, 111, 32, 119, 111, 114, 108, 100};
        String str5 = new String(bytes);
        System.out.println(str5);

        System.out.println("===========================");
        //只有“”创建的字符串对象放到常量区 且只有一份,地址相同
        String t1 = "hello world";
        String t2 = "hello world";
        System.out.println(t1 == t2);//true
        //其他创建的对象放到堆中,每个对象都有自己的地址，地址不同
        String t3 = new String("hello world");
        String t4 = new String("hello world");
        System.out.println(t3 == t4);//false

        System.out.println("======================================");
        //调用字符串的方法，处理字符串数据
        //判断字符串是否相等
        //public boolean equals(Object anObject)
        //案例： 简易版的登录
        //真的学不下去了
        String okLoginName = "admin";
        System.out.println("请输入登录用户名");
        Scanner sc = new Scanner(System.in);
        String loginName = sc.next();

        //注意不能使用 == 判断字符串的相等 ==判断的是地址
        // 字符串内容一样当时地址不一定相等 所以使用 equals方法判断
        if (okLoginName.equals(loginName)) {
            System.out.println("登录成功");
        } else {
            System.out.println("登录失败");
        }

        System.out.println("======================================");

        //19520020202 ==> 195****6520
        System.out.println("请您使用手机号登录");
        String phone = sc.next();

        System.out.println("系统显示以下手机号码进入");
        String newPhone = phone.substring(0, 3) + "****" + phone.substring(7);
        System.out.println(newPhone);
    }


}

