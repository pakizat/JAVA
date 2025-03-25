package day06_oop.polymorphsm2;

public class Tortoise extends Animal {
    String name = "乌龟";
    @Override
    public void run(){
        System.out.println("乌龟跑的贼慢~~~~~");
    }

    //设置独有方法
    public void eat(){
        System.out.println("乌龟在吃虫子~~~~~");
    }

}
