package src.day05_oop.javabean;

public class Student {
    //1. 声明成员变量私有化
    private String name;
    private String sex;
    private int age;
    private int mathScore;
    private int englishScore;
    private int id;
    private String school;

    //使用idea生成构造器
    //无参构造器
    public Student() {
    }
    //有参构造器
    public Student(String name, String sex, int age, int score, int id, String school) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.mathScore = score;
        this.englishScore = score;
        this.id = id;
        this.school = school;
    }

    //使用idea 生成set/get方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    public int getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(int englishScore) {
        this.englishScore = englishScore;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
