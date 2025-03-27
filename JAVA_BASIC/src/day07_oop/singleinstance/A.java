package day07_oop.singleinstance;
//单例类设计模式
// 此类型为 饿汉式单例  在 类加载时，就创建了该类的唯一实例 提前加载到内存
public class A {

    //2. 定义一个静态变量用于记住 该类的唯一实例
    private static A a = new A();

    //1. 私有化构造器  确保构造不对外开放 导致 创建 太多 实例 无法实现 单例类设计
    private A(){}

    //3. 定义一个静态方法，返回该类的唯一实例
    public static  A getInstance(){
        return a;
    }

}
