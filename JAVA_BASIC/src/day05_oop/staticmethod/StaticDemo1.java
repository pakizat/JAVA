package src.day05_oop.staticmethod;

/**
 *  目标 ：理解静态成员变量的作用 及其应用场景  （实例方法与静态方法）
 */
public class StaticDemo1 {
    public static void main(String[] args) {
        //创建多个实例 查看静态成员变量的值
        new Student();
        new Student();
        new Student();
        new Student();
        System.out.println(Student.getCount());

        Student stu1 = new Student("博妞","女",18,98,89,1,"博学谷");
        System.out.println(stu1.getCount());
        Student stu2 = new Student("博仔","男",18,65,75,2,"博学山");
        System.out.println(stu2.getCount());

        StudentOperator operator1 = new StudentOperator(stu1);
        operator1.printInfo();
        StudentOperator operator2 = new StudentOperator(stu2);
        operator2.printInfo();
    }

}
