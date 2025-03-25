package day06_oop.extendsconstructor;

/**
 * 目标 ： 理解和掌握 调用 兄弟构造器 this(...)
 */
public class Test2 {
    public static void main(String[] args) {
        Teacher t = new Teacher("李四", 18, "男");
        System.out.println(t);
    }
}

