package src.day02_basic.operator;

/**
 * 目标 学习理解 自增自减
 */
public class OperatorDemo2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        print(10, 20);
    }

    //体现 变量自增自减的方法
    public static void print(int a, int b) {
        System.out.println(a++);
        System.out.println(a);
        System.out.println(++b);

    }

}
