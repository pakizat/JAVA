package day08_oop.lambda;

/**
 * 目标 ： 理解和 使用Lambda表达式 以及书写规则
 */
public class LambdaDemo1 {
    public static void main(String[] args) {
        //原来的 匿名内部类方法
        Animal a = new Animal() {
            @Override
            public void cry() {
                System.out.println("Animal cry");
            }
        };
        a.cry();
        //使用lambda 表达式简化
        //Animal a1 = () -> System.out.println("Animal cry");
        //报错原因：只能适用于 函数式接口 即 有且仅有一个抽象方法的接口
        System.out.println("====================================");

        //首先定义函数式接口Swim
        //原有的 匿名内部类方法
        Swim s = new Swim() {
            @Override
            public void swim() {
                System.out.println("开始游泳1");
            }
        };
        s.swim();

        //使用lambda表达式简化
        Swim s2 = () -> System.out.println("开始游泳2");
        s2.swim();

    }

}

interface Swim {
    void swim();
}


abstract class Animal {
    public abstract void cry();
}