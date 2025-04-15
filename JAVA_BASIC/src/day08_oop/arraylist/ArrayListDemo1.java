package day08_oop.arraylist;

import java.util.ArrayList;

/**
 * 目标 ： 认识和理解 Arraylist 的基本使用
 */
public class ArrayListDemo1 {
    public static void main(String[] args) {
        //掌握基本使用
        //创建一个集合
        // ArrayList<E> list = new ArrayList<>(); //E 泛型
        //指定集合数据类型
        System.out.println("=====创建一个String类型集合=====");
        ArrayList<String> list = new ArrayList<>();
        //添加数据
        System.out.println("=====添加数据=====");
        list.add("hello");
        list.add("world");
        list.add("java1");
        list.add("java2");
        list.add("pake");
        //查看数据
        System.out.println("=====查看数据=====");
        System.out.println(list);//[hello, world, java1, java2, pake]
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //删除数据
        System.out.println("=====删除数据=====");
        System.out.println("=====根据索引删除=====");
        System.out.println(list.remove(1));//根据索引删除 返回删除的内容
        System.out.println(list);
        System.out.println("=====根据内容删除=====");
        System.out.println(list.remove("pake"));//根据内容删除 返回真假
        System.out.println(list);
        //修改数据
        System.out.println("=====修改数据=====");
        System.out.println(list);
        list.set(0,"new");
        System.out.println(list);
    }
}
