package day06_oop.extendsfeature;

public class Test {
}


// java 继承支持 多层继承
class A extends Test{}

class B extends A{}

//但是java 不支持 多继承 即多个父类

//class C extends Test,A{}

//原因 当 两个父类中有同名的成员变量时，子类无法区分到底是哪个父类的成员变量，所以java不支持多继承
