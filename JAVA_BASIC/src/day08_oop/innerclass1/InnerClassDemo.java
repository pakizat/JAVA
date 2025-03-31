package day08_oop.innerclass1;

/**
 *  目标 : 搞清楚成员内部类的语法
 */
public class InnerClassDemo {

    public static void main(String[] args) {
        //创建对象的格式
        //1.外部类.内部类 对象名 = new 外部类().new 内部类();
        Outer oi = new Outer();
        Outer.Inner oz = oi.new Inner();



            //成员内部类 访问外部类成员的特点（拓展）
            //1.成员内部类中可以直接访问外部类的静态成员
            //2.成员内部类中可以直接访问外部类的静态方法
            //3.也可以直接访问外部类的实例成员 因为 他是属于对象所有
            //调用show

        System.out.println("oz.show();");
        oz.show();

        System.out.println("oi.show2();");
        oi.show2();


        //2.成员内部类的实例方法中，可以直接拿到寄生的外部类的对象
        //使用 外部类名.this
        System.out.println("对比" + oi.getOuter());


        //3.面试小题目
        People p = new People();
        People.Heart h = p.new Heart();
        h.show();
    }
}

class People{
    private int heartbeat = 100;

    public class Heart{
        private int heartbeat =80;

        public void show(){
            int heartbeat = 200;
            //200
            System.out.println(heartbeat);
            //80
            System.out.println(this.heartbeat);
            //100
            System.out.println(People.this.heartbeat);
        }
    }

}
