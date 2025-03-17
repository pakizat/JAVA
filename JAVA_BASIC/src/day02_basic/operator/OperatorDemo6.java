package src.day02_basic.operator;

/**
 * 目标：学习使用逻辑运算符
 */
public class OperatorDemo6 {
    public static void main(String[] args) {
        demo1();
    }

    //设计场景使用逻辑运算 逻辑与 逻辑或 逻辑非 逻辑异或
    public static void demo1() {
        //逻辑与 双与
        System.out.println(true && true);//true
        System.out.println(true && false);//false
        System.out.println(false && true);//false
        System.out.println(false && false);//false

        //逻辑或 双或
        System.out.println(true || true);//true
        System.out.println(true || false);//true
        System.out.println(false || true);//true
        System.out.println(false || false);//false

        //逻辑非
        System.out.println(!true);//false
        System.out.println(!false);//true

        //逻辑异或
        System.out.println(true ^ true);//false
        System.out.println(true ^ false);//true
        System.out.println(false ^ true);//true
        System.out.println(false ^ false);//false
    }


}
