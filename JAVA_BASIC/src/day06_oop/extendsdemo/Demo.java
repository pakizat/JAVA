package day06_oop.extendsdemo;

import day06_oop.extendsmodifier.People;

/**
 * 目标 ： 继承的语法
 */
public class Demo {

    public static void main(String[] args) {
        //创建子类 验证是否继承 父类的非私有属性和方法
        Teacher t = new Teacher();
        t.setName("张三");
        t.setAge(30);
        t.setSex("男");
        //子类成员变量
        t.setJob("教师");

        //skill 属于另一个子类 不属于父类
//        t.setSkill("Java");

        //子类对象是由 父类与子类共同创造的

        System.out.println(t.getName());
        System.out.println(t.getAge());
        System.out.println(t.getSex());
        System.out.println(t.getJob());


        //对于类中 成员的权限修饰 不是本类 预期 验证 3
        day06_oop.extendsmodifier.People P = new People();
        //缺省 本类 同一个包中的类
//        P.none_number = 100;
        //protected 本类 同一个包中的类 子孙类中
//        P.protected_number = 200;
        //public 任意位置中访问
        P.public_number = 300;
        //private 只能本类访问
//        P.private_number

    }
}
