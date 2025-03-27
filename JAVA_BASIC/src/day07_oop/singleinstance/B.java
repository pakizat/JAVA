package day07_oop.singleinstance;
// 懒汉式单实例设计模式
//用对象时才开始创建对象 第一次使用较慢 但是 比较饿汉省内存
public class B {

    //1.定义一个私有静态变量
    private static B b;

    //2.私有化构造方法
    private B(){}


    //3.提供公共静态方法 当需要对象的时候 真正的创建对象
    public static B getInstance()
    {
        //当第一次需要对象的时候 真正的创建对象
       if ( b == null){
           b = new B();
       }

       return b;
    }
}
