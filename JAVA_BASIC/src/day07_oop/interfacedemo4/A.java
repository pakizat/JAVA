package day07_oop.interfacedemo4;

public interface A {
    //JDK8开始接口新增的三个方法
    //public 可省略
    public default void print(){
        System.out.println("default 方法被执行了");
        print2();
    }

    private void print2(){
        System.out.println("private 方法被执行了");

    }

    //public 可 省略
    public static void print3(){
        System.out.println("static 方法被执行了");
    }
}

