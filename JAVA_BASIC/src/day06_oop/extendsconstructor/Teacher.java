package day06_oop.extendsconstructor;

// Teacher类继承People类 子类
public class Teacher extends People {
    private String job;


    public Teacher() {
    }

    public Teacher(String name, int age, String sex) {
        this(name, age, sex, "人民教师");
    }

    public Teacher(String name, int age, String sex, String job) {
        super(name, age, sex);
        this.job = job;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", sex='" + super.getSex() + '\'' +
                ", job='" + job + '\'' +
                '}';
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
