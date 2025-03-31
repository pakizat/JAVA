package day07_oop.interfacedemo3;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DemoInterfaceImpl1  implements DemoInterface{

    private Student[] students;

    //打印学生信息
    @Override
    public void printInfo() {
        for (int i = 0; i < students.length; i++) {
            System.out.println("姓名：" + students[i].getName() + "\n性别：" +  students[i].getSex() + "\n成绩："+ students[i].getScore() + "\n" );

        }
    }

    //打印平均成绩
    @Override
    public void printAverage() {
        double sum = 0;
        for (int i = 0; i < students.length; i++) {
            sum += students[i].getScore();
        }
        System.out.println("班级平均成绩为：" + sum / students.length);
    }
}
