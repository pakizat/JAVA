package src.day05_oop.capsulation;

/**
 * 目标 了解封装的设计思想 合理隐藏合理暴露 学会隐藏和暴露的方法
 */
public class CapsulationDemo1 {
    public static void main(String[] args) {
        Student s1 = new Student();

        System.out.println( "==============set方法赋值私有化的成员变量赋值================");

        s1.setName("张三");
        s1.setAge(18);
        s1.setSex("男");
        s1.setScore(100);
        s1.setId(1001);
        s1.setSchool("清华大学");

        System.out.println( "==============get方法获取私有化的成员变量赋值================");

        s1.printInfo();
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s1.getSex());
        System.out.println(s1.getScore());
        System.out.println(s1.getId());
        System.out.println(s1.getSchool());

        System.out.println("==================通过公共的方法输出对象信息======================");
        s1.printInfo();
    }
}
