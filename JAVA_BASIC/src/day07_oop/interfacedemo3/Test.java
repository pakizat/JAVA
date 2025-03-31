package day07_oop.interfacedemo3;

/**
 *  目标： 实现综合案例
 */
public class Test {
    public static void main(String[] args) {
        //首先需要一个学生类封装需求属性
        //其次要存储全班学生对象
        //定义引用类型数组 存储 学生对象
        Student[] students = new Student[10];
        students[0] = new Student("张三","男",99.9);
        students[1] = new Student("李四","男",88.8);
        students[2] = new Student("王五","女",77.7);
        students[3] = new Student("赵六","女",66.6);
        students[4] = new Student("孙七","男",55.5);
        students[5] = new Student("周八","男",44.4);
        students[6] = new Student("吴九","女",33.3);
        students[7] = new Student("郑十","男",22.2);
        students[8] = new Student("王十一","女",11.1);
        students[9] = new Student("赵十二","男",10.0);


        //根据需求 首先定义一个接口
        //  规划实现需求的 抽象方法
        //  定义两套接口实现类 实现面向接口编程 （解耦合）
        DemoInterface a = new DemoInterfaceImpl2(students);
        a.printInfo();
        a.printAverage();

    }
}
