package day01.variable;

/**
 *目标 ：认识变量
 */
public class VariableDemo {
    public static void main(String[] args) {
                printVariable();
    }
    //定义一个方法来学习变量的定义
    public static void printVariable(){
        //定义一个变量
        int a = 10;
        System.out.println(a);
        //定义一个小数变量用来存储学生的java成绩
        double score = 99.9;
        System.out.println(score);

        //定义一个变量 将其打印四次 体现了变量便于维护 的特点
        int sum = 10;
        System.out.println(sum);
        System.out.println(sum);
        System.out.println(sum);
        System.out.println(sum);

        //分隔符
        System.out.println("========================================");

        //动态显示变量的值的变化
        int b = 10;
        System.out.println(b);
        b = b + 10;
        System.out.println(b);
        b = b - 10;
        System.out.println(b);


    }
}
