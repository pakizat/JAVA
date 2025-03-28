package day07_oop.interfacedemo1;

/**
 * 目标 ： 认识 理解 接口类
 */
public class Test {
    public static void main(String[] args) {
        //接口 不能创建对象
        //'A' is abstract; cannot be instantiate
        // A a = new A();
        //但是实现类可以创建对象
        C c = new C();
        c.show();
        c.run();
        c.eat();
        c.jump();
    }


}

//实现类 可以实现多个接口 但是必须重写他们的所有方法
class C implements A, B{

    @Override
    public void show() {
        System.out.println("实现类重写的 show ");

    }

    @Override
    public void run() {
        System.out.println("实现类重写的 run ");

    }

    @Override
    public void eat() {
        System.out.println("实现类重写的 eat ");

    }

    @Override
    public void jump() {
        System.out.println("实现类重写的 jump ");

    }
}