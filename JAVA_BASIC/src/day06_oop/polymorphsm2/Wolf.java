package day06_oop.polymorphsm2;

public class Wolf extends Animal {
    String name = "大灰狼";
    @Override
    public void run(){
        System.out.println("大灰狼跑的贼快~~~~~");
    }

    //设置独有方法
    public void eat(){
        System.out.println("大灰狼吃肉");
    }

}
