package day02.operator;

/**
 * 目标 理解关系运算符
 */
public class OperatorDemo4 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        print(a, b);
    }

    public static void print(int a, int b) {
        System.out.println(a == b);//false
        System.out.println(a != b);//true
        System.out.println(a > b);//false
        System.out.println(a < b);//true
        System.out.println(a >= b);//false
        System.out.println(a <= b);//true
    }
}
