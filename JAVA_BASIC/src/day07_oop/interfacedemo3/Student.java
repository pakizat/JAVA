package day07_oop.interfacedemo3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private String name;//学生姓名
    private String sex;//性别
    private double score;//成绩
}
