package src.day03_flowcontrol.controlflow;

import java.util.Scanner;

/**
 * 目标 理解switch语句注意事项
 */
public class SwitchDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printWeek(sc.nextInt());
        System.out.println(0.1+0.2);
        printWeek2(sc.nextInt());
       //从上面注释代码可以了解到 扫描器存储的值不会传递到printWeek2方法中 每次调用要输入
//        Scanner sc = new Scanner(System.in);
//        int day = sc.nextInt();
//        printWeek(day);
//        System.out.println(0.1+0.2);
//        printWeek2(day);
    }
    //1.switch表达式类型只能是byte,short,char,int,枚举,String
    public static void printWeek(int day){
        switch (day){
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("输入错误");
        }

    }
    public static void printWeek2(int day){
        //2.演示switch的穿透性
        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("工作日");
                break;
            case 6:
            case 7:
                System.out.println("休息日");
                break;
            default:
                System.out.println("输入错误");
        }
    }

}
