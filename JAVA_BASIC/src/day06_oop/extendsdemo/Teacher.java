package day06_oop.extendsdemo;
// Teacher类继承People类 子类
public class Teacher extends People{
    private String job;


    public Teacher() {
    }

    public Teacher(String name, int age, String sex, String job) {
        super(name, age, sex);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
