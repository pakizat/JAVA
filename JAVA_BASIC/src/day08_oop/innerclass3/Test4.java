package day08_oop.innerclass3;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 目标： 完成给数组排序，理解其中匿名内部类的用法
 */
public class Test4 {
    public static void main(String[] args) {
        Student[] students = new Student[6];
        students[0] = new Student("张三", 18, 180, '男');
        students[1] = new Student("李四", 19, 170, '女');
        students[2] = new Student("王五", 20, 160, '男');
        students[3] = new Student("赵六", 21, 150, '女');
        students[4] = new Student("孙七", 22, 140, '男');
        students[5] = new Student("钱八", 23, 130, '女');

        //需求： 按照年龄升序排序。可以调用API调用
        //Arrays.sort(T[] a, Comparator<? super T> c);
        //参数一 需要排序的数组
        //参数二 排序规则 需要给sort声名一个比较器对象
        //sort 方法会调用内部类对象的compare方法对数组中的学生对象进行两两比较
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //指定排序规则
                //如果你认为左边对象 大于 右边对象，返回正数
                //如果认为左边对象 小于 右边对象，返回负数
                //如果认为左边对象 等于 右边对象，返回0
//                if (o1.getAge() > o2.getAge()) {
//                    return 1;
//                } else if (o1.getAge() < o2.getAge()) {
//                    return -1;
//                }
//                return 0 ;
                //简化算法
                return o1.getAge() - o2.getAge();//按照年龄升序排序
                //return o2.getAge() - o1.getAge();//按照年龄降序排序
            }
        });


        //遍历数组
        for (Student student : students) {
            Student s = student;
            System.out.println(s);
        }
    }
}
