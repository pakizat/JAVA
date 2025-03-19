package src.day05_oop.capsulation;
//学生类
public class Student {
    //1. 声明成员变量私有化
    private String name;
    private String sex;
    private int age;
    private int score;
    private int id;
    private String school;

    //创建构造器
    //无参构造器
    public Student(){
        System.out.println("新的对象诞生");
    }
    //有参构造器
    public Student(String name, String sex, int age, int score, int id, String school) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.score = score;
        this.id = id;
        this.school = school;

    }


    //类中构造方法 体现封装的思想
    //通过构造公共方法来 实现成员变量的取值与赋值 方法中还可包含数据校验
    public void setName(String name) {
        if (!name.isEmpty() && name.length() < 20) {
            this.name = name;
        } else {
            System.out.println("名字长度不合法");
        }
    }public String getName() {
        return name;
    }

    public void setSex(String sex) {
        if (sex.equals("男") || sex.equals("女")) {
            this.sex = sex;
        } else {
            System.out.println("性别不合法");
        }
    }

    public String getSex() {
        return sex;
    }

    public void setAge(int age) {
        if (age > 0 && age < 150) {
            this.age = age;
        } else {
            System.out.println("年龄不合法");
        }
    }

    public int getAge() {
        return age;
    }

    public void setScore(int score) {
        if (score > 0 && score < 150) {
            this.score = score;
        } else {
            System.out.println("成绩不合法");
        }
    }


    public int getScore() {
        return score;
    }

    public void setId(int id) {
        if (id > 0 && id < 150) {
            this.id = id;
        } else {
            System.out.println("学号不合法");
        }
    }

    public int getId() {
        return id;
    }

    public void setSchool(String school) {
        if (!school.isEmpty() && school.length() < 20) {
            this.school = school;
        } else {
            System.out.println("学校名字不合法");
        }
    }

    public String getSchool() {
        return school;
    }



    public void printInfo() {
        System.out.println("姓名：" + name + "，年龄：" + age + "，性别：" + sex + "，学号：" + id + "，成绩：" + score + "，学校：" + school);
    }
}
