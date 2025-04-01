package day08_oop.innerclass3;

/**
 * 目标： 认识匿名内部类，了解基本作用
 */
public class Test {
    public static void main(String[] args) {
        //创建一个对象
        //匿名内部类实际上是有名字： 外部类名$编号.class
        //匿名内部类也是一个子类，并会立即创建一个子类对象
        Animal cat = new Animal() {
            @Override
            public void cry() {
                System.out.println("喵喵喵");
            }
        };
    }
}




//匿名内部类不再需要定义子类
//class Cat extends Animal {
//    @Override
//    public void cry() {
//        System.out.println("喵喵喵");
//    }
//}