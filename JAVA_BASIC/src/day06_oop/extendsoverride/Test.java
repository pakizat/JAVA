package day06_oop.extendsoverride;
/*
 * 继承：子类继承父类，子类可以拥有父类的属性和方法，子类也可以拥有自己的属性和方法。
 * 方法重写 可重写子类的方法 使用@Override注解 校验 重写 可读性高
 */
public class Test {
    public static void main(String[] args) {
        Cat a = new Cat();
        a.call();

    }
}


class Animal{

    public void call(){
        System.out.println("动物在叫~~~~");
    }

}


class Cat extends Animal{

    @Override
    public void call(){
        System.out.println("小猫在叫~~~~");
    }
}