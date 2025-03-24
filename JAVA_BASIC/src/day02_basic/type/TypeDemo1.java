package day02_basic.type;

/**
 * 目标 ：理解类型转换中 的 自动转换与强制转换
 */

public class TypeDemo1 {
    public static void main(String[] args) {
            byte a = 10;
            //小变大自动转换
            printVariable(a);
        System.out.println("================================================");
            int b = 12;
            byte c = (byte) b;
            //大变小强制转换
            //printVariable2(b);直接写入b会报错需要强制转换类型
            printVariable2((byte)b);
            printVariable2(c);
        System.out.println("================================================");
        //小数强制转换为整数会直接丢失小数部分
        double d = 12.6;
        int e = (int) d;
        printVariable(e);
    }
    //定义一个方法接收int类型打印出来
    public static void printVariable(int a){
        System.out.println(a);
    }
    //定义一个方法接收byte类型打印出来
    public static void printVariable2(byte a){
        System.out.println(a);
    }

}
