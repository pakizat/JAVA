package day07_oop.demo;

import java.util.Scanner;

/**
 * 目标 ： 智能家居控制系统
 * 需求： 可以让用户选择要控制的家具设备，并可以对它们执行开关操作
 */
public class Test {
    public static void main(String[] args) {
        // 设计模版父类
        //设计功能接口
        //创建家具对象 使用 父类引用数组存储对象
        JD[] jds = new JD[4];
        jds[0] = new Light("小米智能灯",true);
        jds[1] = new WashMachine("海尔洗衣机",false);
        jds[2] = new TV("创维电视",false);
        jds[3] = new Air("格力空调",false);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("======================================");
            System.out.println("欢迎来到家电控制App");
            //调用单例类控制类
            ItemController.getInstance().totalStatus(jds);
            System.out.println("请输入你要控制的家电 或者输入 0 退出系统");
            int op =sc.nextInt();
            if ( op != 0) {
                ItemController.getInstance().Switch(jds[op - 1]);
            } else {
                System.out.println("退出App");
                return;
            }
        }
    }

}
