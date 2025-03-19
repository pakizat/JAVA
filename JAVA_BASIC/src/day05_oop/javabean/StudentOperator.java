package src.day05_oop.javabean;

public class StudentOperator {
    private Student s;

    //有参构造函数传入对象
    public StudentOperator(Student s){
        this.s = s;
    }



    //1.打印总成绩
    public void totalScore(){
        System.out.println(s.getName() + "的总成绩为：" + (s.getMathScore() + s.getEnglishScore()));
    }
    //2.打印平均成绩
    public void averageScore(){
        System.out.println(s.getName() + "的平均成绩为：" + ((s.getMathScore() + s.getEnglishScore()) / 2));
    }
    //3.打印学生信息
    public void printInfo() {
        System.out.println("姓名：" + s.getName() + "，年龄：" + s.getAge() + "，性别：" + s.getSex() + "，学号：" + s.getId() + "，数学成绩：" + s.getMathScore() + "，英语成绩：" + s.getEnglishScore() + "，学校：" + s.getSchool() );
    }
}
