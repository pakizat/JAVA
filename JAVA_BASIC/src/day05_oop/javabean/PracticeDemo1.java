package day05_oop.javabean;

/**
 * 目标 搞清楚实体类是什么 搞清楚基本作用与应用场景 以及初次使用业务类
 */
public class PracticeDemo1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(18);
        s1.setSex("男");
        s1.setMathScore(100);
        s1.setEnglishScore(98);
        s1.setId(1001);
        s1.setSchool("清华大学");

        StudentOperator op = new StudentOperator(s1);
        op.totalScore();
        op.averageScore();
        op.printInfo();


    }
}
