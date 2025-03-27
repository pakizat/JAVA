package day07_oop.abstractdemo1;
//创建抽象类

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class A {
    //1.创建抽象方法(可以不创建) 抽象类可以没有抽象方法但是有抽象方法的类一定是抽象类
    public abstract void eat();
    //2.抽象类可以拥有普通方法  即类有的 成员变量 成员方法 构造器 抽象类都可以有
    private String name;
    private int age;
    public void sleep(){
        System.out.println("sleep");
    }

}
