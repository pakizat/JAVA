package day08_oop.gui;

import javax.swing.*;

/**
 * 目标 ：快速入门 GUI Swing 的变成
 */
public class JFrameDemo1 {
    public static void main(String[] args) {
        //1.创建一个窗口，有一个登录按钮
        JFrame jf = new JFrame("登录窗口");

        JPanel jp = new JPanel();
        jf.add(jp);

        jf.setSize(800, 600);//窗口大小
        jf.setLocationRelativeTo(null);//居中显示
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭窗口退出程序

        JButton jb = new JButton("登录");
        jb.setBounds(200, 200, 200, 100);
        jp.add(jb);//添加按钮到窗口
        jf.setVisible(true);//显示窗口

    }
}
