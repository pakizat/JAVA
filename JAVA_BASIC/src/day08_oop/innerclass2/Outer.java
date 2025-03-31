package day08_oop.innerclass2;
//外部类
public class Outer {
    public static  String a = "外部类静态成员";

    //定义静态内部类 由于是静态所以属于类本身持有
    public static class Inner{

        public void show(){
            System.out.println("外部类静态内部类");
            System.out.println(a);
        }

    }
}
