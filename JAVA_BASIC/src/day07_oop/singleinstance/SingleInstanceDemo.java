package day07_oop.singleinstance;

/**
 * 目标 ： 设计 一个 单例类
 */
public class SingleInstanceDemo {
    public static void main(String[] args) {

        //创建对象 私有化构造器无法创建
//        A a1 = new A();
//        A a2 = new A();
//        A a3 = new A();
//        A a4 = new A();


        //如不定义静态方法 去返回对象 且定义私有化成员变量（也可使用 final 修饰 成员变量）  可以直接访问成员变量 将其杀死 将唯一对象丢了
//        A.a = null;

        A a1 = A.getInstance();
        A a2 = A.getInstance();
        System.out.println(a2);
        System.out.println(a1);
        System.out.println(a1 == a2);

        System.out.println("===========================");

        B b1 = B.getInstance();
        B b2 = B.getInstance();
        System.out.println(b1 == b2);
        System.out.println(b1);
        System.out.println(b2);
    }
}
