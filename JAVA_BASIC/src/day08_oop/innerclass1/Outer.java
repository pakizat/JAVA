
package day08_oop.innerclass1;

// 外部类

public class Outer {
    //静态成员
    public static  String a = "外部类静态成员";

    //外部类的实例成员
    private String b = "外部类实例成员";

    //静态方法
    public static void show1() {
        System.out.println("外部类,静态方法");
    }

    //实例方法
    public void show2() {
        System.out.println("外部类,实例方法");
    }

    public Outer getOuter() {
        return this;
    }

    // 成员内部类，无static修饰，由外部类的对象所持有的
    public class Inner {
        public void show() {
            System.out.println("外部类,成员内部类");
            //成员内部类 访问外部类成员的特点（拓展）
            //1.成员内部类中可以直接访问外部类的静态成员
            System.out.println(a);
            System.out.println(Outer.a);
            //2.成员内部类中可以直接访问外部类的静态方法
            show1();
            //3.也可以直接访问外部类的实例成员
            System.out.println(b);
            //4.也可以直接访问外部类的实例方法
            show2();
            //5.直接拿到外部类对象
            System.out.println(Outer.this);
        }
    }
}
