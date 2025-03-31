package day08_oop.innerclass2;

/**
 * 目标 ： 了解静态内部类的语法
 */
public class InnerClassDemo {
    public static void main(String[] args) {
        //创建对象
        Outer.Inner oi = new Outer.Inner();

        //1.静态内部类中，可以直接访问外部类的静态成员
        //2.静态内部类中，不可以直接访问外部类的实例成员 需使用外部类对象访问
        oi.show();
    }
}
