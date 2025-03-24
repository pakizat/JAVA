package day02_basic.operator;

/**
 * 目标 学习理解扩展赋值运算符
 */
public class OperatorDemo3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        print(a, b);
    }

    //设计一个方法体现扩展赋值运算符的使用
    public static void print(int a, int b) {
        System.out.println(a += b);
        System.out.println(a -= b);
        System.out.println(a *= b);
        System.out.println(a /= b);
        System.out.println(a %= b);
    }
}
