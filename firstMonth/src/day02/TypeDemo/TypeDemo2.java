package day02.TypeDemo;

/**
 * 目标； 体验表达式的自动类型提升
 */
public class TypeDemo2 {
    public static void main(String[] args) {
        byte a = 10;
        short b = 20;
        int c = 30;
        double d = 40.2;
        print(a,b,c,d);

    }
    //定义一个方法接收各种类型的形参并一同运算
    public static void print(byte a, short b,int c,double d){
        System.out.println(a+b+c+d);
    }

}
