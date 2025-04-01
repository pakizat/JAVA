package day08_oop.methodreference1;
/**
 * 目标： 实例方法引用
 */

import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args) {
        test1();
    }
    public static void test1(){
        Student[] students = new Student[6];
        students[0] = new Student("张三", 18, 180, '男');
        students[1] = new Student("李四", 19, 170, '女');
        students[2] = new Student("王五", 20, 160, '男');
        students[3] = new Student("赵六", 21, 150, '女');
        students[4] = new Student("孙七", 22, 140, '男');
        students[5] = new Student("钱八", 23, 130, '女');


        Student s1 = new Student();
        //实例方法引用 对象名::实例方法名
//        Arrays.sort(students, (o1, o2) -> s1.compareByHeight(o1, o2));
        //箭头前后的参数类型必须一致才能实例方法引用
        Arrays.sort(students, s1::compareByHeight);

        //遍历数组
        for (Student student : students) {
            Student s = student;
            System.out.println(s);
        }
    }
}
