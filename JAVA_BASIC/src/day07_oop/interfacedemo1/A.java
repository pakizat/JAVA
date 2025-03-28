package day07_oop.interfacedemo1;

public interface A {
    //在接口里只能定义常量，以及抽象方法

    //1.常量
    //在接口定义常量时 默认不写public static final
    public static final int NUM = 10;
    String NAME = "pake";

    //2.抽象方法(用abstract 修饰 不带方法体)
    //在接口定义抽象方法时 默认不写public abstract
    public abstract void show();
    void run();
}
