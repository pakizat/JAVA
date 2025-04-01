package day08_oop.lambda;

import day08_oop.innerclass3.Student;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Arrays;
import java.util.Comparator;

/**
 * 目标 :使用 lambda表达式简化实际示例
 */
public class LambdaDemo2 {
    public static void main(String[] args) {
        test1();
        test2();

    }


    public static void test1() {
        Student[] students = new Student[6];
        students[0] = new Student("张三", 18, 180, '男');
        students[1] = new Student("李四", 19, 170, '女');
        students[2] = new Student("王五", 20, 160, '男');
        students[3] = new Student("赵六", 21, 150, '女');
        students[4] = new Student("孙七", 22, 140, '男');
        students[5] = new Student("钱八", 23, 130, '女');

        //需求： 按照年龄升序排序。可以调用API调用
        //Arrays.sort(T[] a, Comparator<? super T> c);
        //参数一 需要排序的数组
        //参数二 排序规则 需要给sort声名一个比较器对象
        //sort 方法会调用内部类对象的compare方法对数组中的学生对象进行两两比较
//            Arrays.sort(students, new Comparator<Student>() {
//                @Override
//                public int compare(Student o1, Student o2) {
//
//                    return o1.getAge() - o2.getAge();//按照年龄升序排序
//                }
//            });

        //简化代码
        Arrays.sort(students, (Student o1, Student o2) -> {
            return o1.getAge() - o2.getAge();
        });

        //进一步简化 参数类型可以不写 只有一行代码时可以不写大括号 “;”号也要省略 如果是return语句 也必须去掉 return
        Arrays.sort(students, (o1, o2) -> o1.getAge() - o2.getAge());

        //遍历数组
        for (Student student : students) {
            Student s = student;
            System.out.println(s);
        }
    }


    public static void test2() {
        JFrame jf = new JFrame("匿名内部类的使用场景");
        jf.setSize(400, 300);
        jf.setVisible(true);//可视化
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭界面操作
        jf.setLocationRelativeTo(null);//居中显示

        JPanel jp = new JPanel();
        jf.add(jp);
        JButton jb = new JButton("登录");
        jp.add(jb);

        //java要求必须给这个按钮添加一个点击事件监听器对象，这样就可以监听用户的点击操作，就可以做出反应
        //开发中不是我们要主动去写匿名内部类，而是用别人的功能的时候，别人可以让我们写一个匿名内部类，我们才写！
//        jb.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("登陆成功");
//            }
//        });

        //简化代码
        jb.addActionListener((ActionEvent e) -> {
            System.out.println("登陆成功");
        });

        //进一步简化代码 简化参数类型 以及一个参数类型 可以去掉小括号 只有一行也能去掉大括号和分号
        jb.addActionListener(e -> System.out.println("登陆成功"));

    }
}










