package src.day05_oop.constructor;

/**
 * 这是一个学生类
 */
public class Student {
    String name;
    String sex;
    int age;
    int score;
    int id;
    String school;

    public Student(){

        System.out.println("这是一个无参构造器");
    }

    public Student(String a,String b, int c, int d, int e, String f) {
        name = a;
        sex = b;
        age = c;
        score = d;
        id = e;
        school = f;

    }

    public Student(String name){

        System.out.println(name + "诞生了");
    }
    public void printInfo() {
        System.out.println("姓名：" + name + "，年龄：" + age + "，性别：" + sex + "，学号：" + id + "，成绩：" + score + "，学校：" + school);
    }
}
