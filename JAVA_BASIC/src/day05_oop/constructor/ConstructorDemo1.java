package day05_oop.constructor;

/**
 * 目标 ： 搞清楚类的构造器类型 作用 及其应用场景
 */
public class ConstructorDemo1 {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "张三";
        s1.age = 18;
        s1.sex = "男";
        s1.score = 100;
        s1.school = "清华大学";
        s1.id = 1001;
        s1.printInfo();


        Student s2 = new Student("李四","女", 19, 98, 1002,"清华大学");
        s2.printInfo();

        Student s3 = new Student("张三");
    }


}
