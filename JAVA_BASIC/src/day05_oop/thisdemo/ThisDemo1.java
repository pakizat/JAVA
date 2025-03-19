package src.day05_oop.thisdemo;

/**
 *  目标 ： 认识  this 关键词 了解掌握 其 使用场景
 */

public class ThisDemo1 {
    public static void main(String[] args) {
        Student s1 = new Student("李四","女", 19, 98, 1002,"清华大学");
        s1.printInfo();

    }
}
