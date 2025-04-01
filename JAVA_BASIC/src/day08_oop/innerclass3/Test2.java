package day08_oop.innerclass3;

/**
 * 目标 ： 搞清楚 匿名内部类的使用形式（语法）： 通常可以作为一个对象参数传输给一个方法使用
 * 需求 ： 学生、老师要参加游泳比赛
 */
public class Test2 {
    public static void main(String[] args) {
        //原有方法
//        Swim s1 = new Student();
//        test(s1);
//        Swim s2 = new Teacher();
//        test(s2);
        //匿名内部类
        Swim s1 = new Swim() {
            @Override
            public void swimming() {
                System.out.println("学生正在游泳");
            }
        };
        test(s1);
        System.out.println("=========================================");
        //第二种方法
        test(new Swim() {
            @Override
            public void swimming() {
                System.out.println("老师正在游泳");
            }
        });
        //对象回调用
    }
    public static void test(Swim s){
        System.out.println("开始游泳");
        s.swimming();
        System.out.println("游泳结束");
    }
}


//原有方法
//class Student implements Swim{
//    @Override
//    public void swimming(){
//        System.out.println("学生正在游泳");
//    }
//}
//class Teacher implements Swim{
//    @Override
//    public void swimming(){
//        System.out.println("老师正在游泳");
//    }
//}

interface Swim{
    void swimming();//游泳方法
}