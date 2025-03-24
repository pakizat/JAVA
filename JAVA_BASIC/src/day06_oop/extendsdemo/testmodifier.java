package day06_oop.extendsdemo;


import day06_oop.extendsmodifier.People;

public class testmodifier extends People {

    public testmodifier() { }
    public static void main(String[] args) {
        //对于类中 成员的权限修饰 不是本类 预期 验证 2 3
        testmodifier t = new testmodifier();
        //缺省 本类 同一个包中的类
//        t.none_number = 100;
        //protected 本类 同一个包中的类 子孙类中
        t.protected_number = 200;
        //public 任意位置中访问
        t.public_number = 300;
        //private 只能本类访问
//        t.private_number


        //注 是关于 protected 修饰 在不同包时只能通过子类实例访问 不能通过父类实例访问
        /*kimi :protected 成员在不同包的子类中不能通过父类实例直接访问，但可以通过子类实例或子类方法来访问。
         这是 Java 访问控制规则的一部分，旨在保护数据封装和类的继承安全性。*/
    }
}
