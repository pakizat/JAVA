package src.day05_oop.opp;
//学生类
public class Student {
    String name;
    int age;
    String sex;
    int mathScore;
    int englishScore;

    //类中构造方法 体现封装的思想

    //1.构造打印总分的函数
    public  void totalScore(){
        System.out.println(name + "的总成绩是：" + (mathScore + englishScore));
    }

    //2.构造打印平均分的函数
    public  void averageScore(){
        System.out.println(name + "的平均成绩是：" + ((mathScore + englishScore) / 2));
    }
}
