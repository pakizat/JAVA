package day05_oop.moviesys;

import java.util.Scanner;

/**
 * 完成 面向对象 的综合小案例
 */
public class MovieSystem {
    public static void main(String[] args) {
    //1.首先完成 电影的类设计

    //2.其次 考虑使用引用类型数组存储 电影信息
        Movie[] movies = new Movie[6];

    //3.创建6个不同电影信息对象 将他存入数组中
        movies[0] = new Movie(1,"阿甘","罗伯托·贝尼尼",9.6);
        movies[1] = new Movie(2,"夏洛特烦恼","沈腾",6.6);
        movies[2] = new Movie(3,"让子弹飞","姜文", 5.8);
        movies[3] = new Movie(4,"战狼","吴京",2.8);
        movies[4] = new Movie(5,"上学威龙","周星驰",8.7);
        movies[5] = new Movie(6,"无间道","刘德华",7.1);

    // 创建 系统 基础操作 交互
        boolean flag = true;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("============================================");
            System.out.println("欢迎使用 电影管理系统");
            System.out.println("1.显示所有电影信息");
            System.out.println("2.按照id 查询 电影信息");
            System.out.println("0.退出系统");
            System.out.print("请输入你的选择：");
            int option = sc.nextInt();
            switch (option) {
                case 0:
                    System.out.println("欢迎下次使用");
                    flag = false;
                    break;
                case 1:
                    //4. 创建业务处理类 调用业务处理类方法 首先创建业务处理类对象
                    //5.需求一 显示所有电影信息
                    System.out.println("==============================================");
                    System.out.println("需求一 显示所有电影信息");
                    MovieOperator op1 = new MovieOperator(movies);
                    op1.showALLMovieInfo();
                    break;

                case 2:
                    //6.需求二 按照id 查询 电影信息
                    System.out.println("==============================================");
                    System.out.println("需求二 按照id 查询 电影信息");
                    System.out.println("请输入电影 id 以查询相关信息");
                    Scanner sc1 = new Scanner(System.in);
                    int id = sc1.nextInt();
                    MovieOperator op2 = new MovieOperator(movies);
                    op2.getMovie(id);


                    break;

                default:
                    System.out.println("输入有误，请重新输入");
                    break;


            }
        }while (flag);

    }


}
