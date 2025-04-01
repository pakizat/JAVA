package day08_oop.innerclass3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 目标：匿名内部类的使用场景
 */
public class Test3 {
    public static void main(String[] args) {
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
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("登陆成功");
            }
        });



    }
}
