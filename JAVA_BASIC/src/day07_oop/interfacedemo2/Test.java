package day07_oop.interfacedemo2;

import java.sql.Driver;

/**
 * 目标 ：初步认识接口的好处
 */
public class Test {
    public static void main(String[] args) {


        //接口迷不了单继承类的不足，可以让类拥有更多角色 让类更加强大
        //接口可以实现面向接口编程，更利于解耦合
        //想要一个学生来充当司机
        Drive driver1 = new Student();
        driver1.driveSomewhere();
        //想要一个老师来充当司机
        Drive driver2 = new Teacher();
        driver2.driveSomewhere();
    }
}


interface Drive{
    void driveSomewhere();
}

interface Teach{
    void teachSomeone();
}

class People{

}

class Student extends People implements Drive,Teach{

    @Override
    public void driveSomewhere() {
        System.out.println("学生也能获得开车技能");
    }

    @Override
    public void teachSomeone() {
        System.out.println("学生也能教授知识");
    }
}

class   Teacher extends People implements Drive,Teach{

    @Override
    public void driveSomewhere() {
        System.out.println("老师也能获得开车技能");
    }

    @Override
    public void teachSomeone() {
        System.out.println("老师也能教授知识");
    }
 }

