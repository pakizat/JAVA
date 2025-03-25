package day06_oop.extendsoverride;
/**
 * 目标 ： 体验掌握方法重新应用场景
 */
public class Test2 {
    public static void main(String[] args) {

        Student s = new Student("张三",18,"男");
        System.out.println(s); // 输出：day06_oop.extendsoverride.Student@1b6d3586
        //打印的为 包名＋类名＋哈希值 指代对象的内存地址
        System.out.println(s.toString())
        ;//toString()方法变灰 说明 直接输出对象时 默认调用父类Object的toString()方法
//        public String toString() {
//        return getClass().getName() + "@" + Integer.toHexString(hashCode());
//    }
        //为了输出对象的信息，子类重写toString()方法 方便以后以就近原则调用重写的子类方法直接输出对象信息
    }
}

class Student{
    private String name;
    private int age;
    private String sex;


    public Student (){}

    public Student (String name,int age,String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}