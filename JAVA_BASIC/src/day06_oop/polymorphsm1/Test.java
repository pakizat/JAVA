package day06_oop.polymorphsm1;

/**
 * 目标 ： 认识多态 掌握理解多态记得基本规则
 */
public class Test {

    public static void main(String[] args) {
        //1.对象多态
        Animal a1  = new Wolf();
        //2.行为多态
        a1.run();//多态方法：编译看左边 运行看右边
        System.out.println(a1.name);//成员变量 编译看左边 运行看左边
        //1.对象多态
        Animal a2 = new Tortoise();
        //2.行为多态
        a2.run();//多态方法：编译看左边 运行看右边
        System.out.println(a2.name);//成员变量 编译看左边 运行看左边
    }
}
