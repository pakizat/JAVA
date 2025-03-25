package day06_oop.polymorphsm2;

/**
 * 目标 ： 认识多态的优点
 */
public class Test {

    public static void main(String[] args) {
        //1.对象多态
        //多态的好处 多态的右侧是解耦合的
        Animal a1  = new Wolf();
        //2.行为多态
        a1.run();//多态方法：编译看左边 运行看右边
        //多态不能调用独有方法
//        a1.eat();
        run(a1);

        Tortoise a2 = new Tortoise();
        run(a2);
        a2.eat();

        Wolf a3 = new Wolf();
        run(a3);
        a3.eat();





    }

    //构造一个方法传入 所有动物对象
    public static void run(Animal a){
        a.run();
    }
}
