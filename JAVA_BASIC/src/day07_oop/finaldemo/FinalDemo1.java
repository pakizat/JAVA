package day07_oop.finaldemo;

/**
 * 目标 ： 学习理解 关键字 final 的使用
 */
public class FinalDemo1 {
    public static void main(String[] args) {
        //3.final 修饰变量 变量类型有 成员变量 与 局部变量 成员变量 由分为 实例变量 与 静态变量
        final int a = 10;
        //a.该变量 有 且 仅能 被赋值一次 修饰基本类型变量 变量的值不能修改
        //报错
        //a += 20;
        //b.修饰引用类型变量 变量的地址不能修改 变量的值可以修改
        final int[] arr = {12,223,213,1231,213};
        arr[2] = 1;

        //4.常量
    }



}

//1. final  修饰类 该类被称为最终类 即 不能再 被继承了
final class a{

}
//报错 Cannot inherit from final 'day07_oop.finaldemo.a' 即final 修饰的类 不能再被继承
//class b extends a{
//
//}

class b{
    //2. final 修饰方法 该方法被称为最终方法 即 该方法不能再被重写
    public final  void test(){
        System.out.println("test");
    }
}

class c extends b{
    //报错'test()' cannot override 'test()' in 'day07_oop.finaldemo.b'; overridden method is fina
//    @Override
//    public void test(){
//
//    }
}