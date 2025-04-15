package day08_oop.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * 目标 认识GUI的事件处理机制
 */
public class Test {
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


        //给按钮绑定点击事件监听器对象
        jb.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //点击 jb 按钮 触发 事件
                System.out.println("登录成功");

                //e 是事件对象 封装了事件的信息
                JOptionPane.showMessageDialog(jf, "登录成功");

                //需求：监听用户键盘上下左右四个按键的事件
                jb.addKeyListener(new KeyAdapter() {
                    @Override
                    public void keyPressed(KeyEvent e) {
                        //监听键盘事件
                        System.out.println("按下了键盘");

                        //获取按键编码是否是上、下、左、右
                        switch (e.getKeyCode()) {
                            case KeyEvent.VK_UP:
                                System.out.println("按下了上");
                                break;
                            case KeyEvent.VK_DOWN:
                                System.out.println("按下了下");
                                break;
                            case KeyEvent.VK_LEFT:
                                System.out.println("按下了左");
                                break;
                            case KeyEvent.VK_RIGHT:
                                System.out.println("按下了右");
                        }
                    }

                });

            }
        });

        jf.setVisible(true);//显示窗口

        //设置窗口为焦点
        jf.requestFocus();
    }
}
