package day06_oop.extendsmodifier;



/**
 * 目标 ： 对于类中 成员的权限修饰 进行验证与理解
 */
public class Demo {

    public static void main(String[] args) {
        //对于类中 成员的权限修饰 不是本类 预期 验证 1 2 3
        People P = new People();
        //缺省 本类 同一个包中的类
        P.none_number = 100;
        //protected 本类 同一个包中的类 子孙类中
        P.protected_number = 200;
        //public 任意位置中访问
        P.public_number = 300;
        //private 只能本类访问
//        P.private_number



    }
}
