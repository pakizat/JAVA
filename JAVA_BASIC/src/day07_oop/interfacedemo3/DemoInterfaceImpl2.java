package day07_oop.interfacedemo3;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DemoInterfaceImpl2 implements DemoInterface{
    private Student[] students;

    //打印学生信息, 同时输出男女人数
    @Override
    public void printInfo() {
        int male = 0;
        for (int i = 0; i < students.length; i++) {
            System.out.println("姓名：" + students[i].getName() + "\n性别：" +  students[i].getSex() + "\n成绩："+ students[i].getScore() + "\n" );
            if(students[i].getSex() == "男"){
                male++;
            }
        }
        System.out.println("男生人数：" + male + "人，\n女生人数：" + (students.length - male) + "人");
    }

    //打印平均成绩(减掉最高分最低分)
    @Override
    public void printAverage() {
        double sum = 0;
        double min = students[0].getScore();
        double max = students[0].getScore();
        for (int i = 1; i < students.length; i++) {
            sum += students[i].getScore();
            if(students[i].getScore() < min){
                min = students[i].getScore();
            }
            if(students[i].getScore() > max ){
                max = students[i].getScore();
            }
        }
        System.out.println("班级平均成绩为：" + (sum - max - min) / (students.length - 2));
    }
}
