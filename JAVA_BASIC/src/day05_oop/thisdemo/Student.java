package src.day05_oop.thisdemo;
//学生类
public class Student {
    String name;
    String sex;
    int age;
    int score;
    int id;
    String school;

    //创建构造器
    //无参构造器
    public Student(){
        System.out.println("无参构造器");
    }
    //有参构造器
    public Student(String name,String sex, int age, int score, int id, String school) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.score = score;
        this.id = id;
        this.school = school;

    }

    //类中构造方法 体现封装的思想


    public void printInfo() {
        System.out.println("姓名：" + name + "，年龄：" + age + "，性别：" + sex + "，学号：" + id + "，成绩：" + score + "，学校：" + school);
    }
}
