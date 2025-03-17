package src.day02_basic.operator;

/**
 * 目标 学习理解 三元运算符
 */
public class OperatorDemo5 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        print(a, b);
    }

    //设计一个方法体现所有三元运算符的用法
    public static void print(int a, int b) {
        System.out.println("a>b?a:b");
        System.out.println(a + ">" + b + "?" + a + ":" + b);
        System.out.println(a > b ? a : b);
        //如上类似的给出所有剩下的三元运算符
        System.out.println("a<b?a:b");
        System.out.println(a + "<" + b + "?" + a + ":" + b);
        System.out.println(a < b ? a : b);
        System.out.println("a>=b?a:b");
        System.out.println(a + ">=" + b + "?" + a + ":" + b);
        System.out.println(a >= b ? a : b);
        System.out.println("a<=b?a:b");
        System.out.println(a + "<=" + b + "?" + a + ":" + b);
        System.out.println(a <= b ? a : b);
        System.out.println("a==b?a:b");
        System.out.println(a + "==" + b + "?" + a + ":" + b);
        System.out.println(a == b ? a : b);
        System.out.println("a!=b?a:b");
        System.out.println(a + "!=" + b + "?" + a + ":" + b);
        System.out.println(a != b ? a : b);

    }

}
