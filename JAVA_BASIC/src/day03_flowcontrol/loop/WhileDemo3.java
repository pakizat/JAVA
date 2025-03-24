package day03_flowcontrol.loop;

/**
 * 学习了解 while循环
 */
public class WhileDemo3 {
    public static void main(String[] args) {
    }

    //1.while 循环的结构为
    public static void demo1() {
        //初始化
        int i = 0;
        //条件表达式
        while (i < 10) {
            //循环体
            System.out.println(i);
            //步长表达式
            i++;
        }
    }
}
