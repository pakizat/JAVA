package day06_oop.extendsconstructor;
//父类
//继承的特点 ：子类对象可以调用父类中的所有非私有成员变量和方法 减少代码重复

public class People {
    private String name;
    private int age;
    private String sex;

    public People() {
    }

    public People(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
