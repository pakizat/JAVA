package src.day02.operator;

/**
 * 目标熟悉基本运算
 */
public class OperatorDemo1 {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        print(a, b);
        //30
        //-10
        //200
        //0
        //10
        System.out.println("================================================");
        example();

    }

    public static void print(int a, int b) {
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
    }

    //"+" 符号的特殊用途
    public static void example() {
        int a = 10;
        int b = 20;
        System.out.println(a + b);
        System.out.println(a + "11111111");
        System.out.println("22222222" + a);
        System.out.println("3333" + a + b);
        System.out.println(a + b + "4444444");
        System.out.println("555555555" + a + b + "6666666");
    }
}
