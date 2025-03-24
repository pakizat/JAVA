package day05_oop.staticfield;

public class Student {
    private  String name;
    private  String sex;
    private  int age;
    private  int mathScore;
    private  int englishScore;
    private  int id;
    private  String school;
    private  static int count = 0;

    //生成无参构造方法
    public Student(){
        count++;
    }
    //生成有参构造方法
    public Student(String name,String sex, int age, int mathScore, int englishScore, int id, String school){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.mathScore = mathScore;
        this.englishScore = englishScore;
        this.id = id;
        this.school = school;
        count++;
    }

    //生成getter和setter方法


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

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Student.count = count;
    }
}
