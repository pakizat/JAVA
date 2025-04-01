package day08_oop.innerclass3;
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
}
