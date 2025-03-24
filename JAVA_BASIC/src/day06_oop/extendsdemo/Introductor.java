package day06_oop.extendsdemo;
// 继承People类 子类
public class Introductor extends People{

    private String skill;

    public Introductor() {
    }
    public Introductor(String name, int age, String sex, String skill) {
        super(name, age, sex);
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}
