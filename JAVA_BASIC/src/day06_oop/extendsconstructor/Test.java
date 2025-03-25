package day06_oop.extendsconstructor;

/**
 *  目标 ：理解和掌握构造方法调用顺序 super(...)的使用
 */
public class Test {
    public static void main(String[] args) {
        //调用子类的无参构造方法 会先调用父类的无参构造方法 再调用子类的无参构造方法
        Zi z = new Zi();
        //输出：
        //父类无参构造方法
        //子类无参构造方法

        //当 父类 无 无参构造方法 可以使用父类的有参构造方法
        //输出：
        //父类有参构造方法
        //子类无参构造方法




//        Zi z2 = new Zi("张三", 18, "男");
        //输出：
        //父类有参构造方法
        //子类有参构造方法

    }
}



class Zi extends Fu {
    public Zi() {
//        super();//因为子类的构造器  不管有参无参 都会默认使用此行代码 调用父类的构造方法
        super("张三", 18, "男");//当 父类 无 无参构造方法 可以使用父类的有参构造方法
        System.out.println("子类无参构造方法");
    }

//    public Zi(String name, int age, String sex) {
//        System.out.println("子类有参构造方法");
//    }
}


class Fu {
//    public Fu() {
//        System.out.println("父类无参构造方法");
//    }

    public Fu(String name, int age, String sex) {
        System.out.println("父类有参构造方法");
    }

}

