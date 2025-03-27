package day07_oop.abstractdemo3;

public abstract class People {
    //1.模板方法设计模式

    //使用final修饰方法，防止模板内容被重写
    public final void write(){
        System.out.println("标题");
        System.out.println("内容");
        writeMain();
        System.out.println("结束");
    }

    public abstract void writeMain();
}
