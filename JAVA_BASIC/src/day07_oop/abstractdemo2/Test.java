package day07_oop.abstractdemo2;

/**
 * 目标 理解 抽象类的好处
 */
public class Test {
    public static void main(String[] args) {
        //1.抽象类定义的方法没有方法体 减少代码量 因为某些场景 子类都需要重写父类方法 导致父类的方法体是多余的
        //2.当子类继承自 抽象类是 必须重写 抽象类中的所有抽象方法 否则只能定义为 抽象类 可以防止遗忘重写需要的父类方法
        //3.更好的支持多态
        Animal a =new Cat();
        a.call();
        Animal b =new Dog();
        b.call();
    }
}
