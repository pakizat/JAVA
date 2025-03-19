package src.day05_oop.opp;

/**
 * 目标 使用类的属性和方法的封装 实现学生成绩计算
 */
public class GradeCaculate {
    public static void main(String[] args) {
        //1.创建第一个学生对象 并输入名字和成绩
        Student stu1 = new Student();
        stu1.name = "博妞";
        stu1.mathScore = 100;
        stu1.englishScore = 100;
        stu1.sex = "男";
        stu1.age = 18;
        stu1.totalScore();
        stu1.averageScore();

        //2.创建第二个学生对象 并输入名字和成绩
        Student stu2 = new Student();
        stu2.name = "博仔";
        stu2.mathScore = 59;
        stu2.englishScore = 100;
        stu2.sex = "女";
        stu2.age = 19;
        stu2.totalScore();
        stu2.averageScore();

//        //普通的方法构造
//        //1.打印总成绩
//        totalScore(stu1);
//        totalScore(stu2);
//
//        //2.打印平均成绩
//        averageScore(stu1);
//        averageScore(stu2);


    }
//    //普通的方法构造
//    //总成绩计算函数
//    public static void totalScore(Student stu){
//        System.out.println(stu.name + "的总成绩是：" + (stu.mathScore + stu.englishScore));
//    }
//
//    //平均成绩计算函数
//    public static void averageScore(Student stu){
//        System.out.println(stu.name + "的平均成绩是：" + (stu.mathScore + stu.englishScore) / 2);
//    }

}
