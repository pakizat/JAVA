package day07_oop.interfacedemo4;

/**
 * 目标 ： 对于JDK8开始接口新增的三个方法的了解与使用
 */
public class Test {

    //要想调试接口的三个方法 必须先实现接口
    public static void main(String[] args) {
        AImpl a = new AImpl();

        //分别调用三个方法 其中 私有方法只能在 接口内调用 所以在 default中调用了
        a.print();
        //静态方法是 类的方法 通过类名调用
        A.print3();
    }

}


//接口实现
class AImpl implements A{

}