package src.day01_helloworld.literal;
/**
 * 学习目标 掌握字面量的书写格式
 *
 */
public class LiteralDemo {
    public static void main(String[] args) {
        printLiteral();


    }
    public static void printLiteral(){
        //直接输出各种常见字面量
        // 打印布尔值true
        System.out.println(true);
        // 打印布尔值false
        System.out.println(false);
        // 打印字符'a'
        System.out.println('a');
        // 打印字符串"12\n34"，其中\n表示换行
        System.out.println("12\n34");
        // 打印字符串"1\t3"，其中\t表示制表符
        System.out.println("1\t3");
        // 打印字符串"123\b32"，其中\b表示退格
        System.out.println("123\b32");
        // 打印字符串"113\r113"，其中\r表示回车
        System.out.println("113\r113");
        // 打印字符串"3231\f2313"，其中\f表示换页
        System.out.println("3231\f2313");
        // 打印字符串"123\'12312"，其中\'表示单引号
        System.out.println("123\'12312");
        // 打印字符串"2132\"12312"，其中\"表示双引号
        System.out.println("2132\"12312");
        // 打印字符串"1231\\321"，其中\\表示反斜线
        System.out.println("1231\\321");
        // 打印整数123
        System.out.println(123);
        // 打印大整数1234567890
        System.out.println(1234567890);
        // 打印整数1232132
        System.out.println(1232132);
        // 打印浮点数123.456
        System.out.println(123.456);
        // 打印长浮点数123.45678901234567890
        System.out.println(123.45678901234567890);

    }
}
