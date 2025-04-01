package day08_oop.methodreference1;
//学生类

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data 重写toString方法
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    //生成基础属性信息
    private String name;
    private int age;
    private double height;
    private char sex;

    public static int compareByAge(Student s1, Student s2) {
        return s1.getAge() - s2.getAge();
    }

    public int compareByHeight(Student o1, Student o2) {
        return Double.compare(o1.getHeight(), o2.getHeight());
    }
}
