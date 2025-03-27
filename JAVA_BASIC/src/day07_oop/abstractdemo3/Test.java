package day07_oop.abstractdemo3;

/**
 * 目标 ：认识和掌握 模板方法设计模式
 * 需求： 学生和老师都使用 方法打印文章 只有其中 一段 不相同
 * 方案： 抽取抽象类People，People类中定义write()方法输出相同的模板内容其中不同的部分，调用writeMain()方法，打印文章。
 * 定义抽象方法writeMain()，子类Teacher和Student分别实现writeMain()方法，实现了模板方法设计模式。
 */
public class Test {
    public static void main(String[] args) {


        People t = new Teacher();
        t.write();

        People s = new Student();
        s.write();
    }
}
