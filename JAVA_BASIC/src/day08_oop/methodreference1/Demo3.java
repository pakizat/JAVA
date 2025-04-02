package day08_oop.methodreference1;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 目标 ： 特定类型 的方法引用
 * 需求： 有一个字符串数组，里边有一些人的名字，请按照名字首字母升序排序
 */
public class Demo3 {
    public static void main(String[] args) {
        String[] names = {"Tom", "Jerry", "Rose", "Jack", "Tony","angela","Andy","caocao","曹操","baby","damn"};

        //要把这个数组进行排序：Arrays.sort(names,  Comparator)
        //Arrays.sort(names);//就是按照首字母编号升序排序
        //[Andy, Jack, Jerry, Rose, Tom, Tony, angela, baby, caocao, damn, 曹操]

//        Arrays.sort(names, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareToIgnoreCase(o2);
//            }
//        });
//        //[Andy, angela, baby, caocao, damn, Jack, Jerry, Rose, Tom, Tony, 曹操]

//        Arrays.sort(names, (o1,o2) -> o1.compareToIgnoreCase(o2));

        //特定类的方法引用：类名::方法名
        Arrays.sort(names, String::compareToIgnoreCase);

        System.out.println(Arrays.toString(names));

    }

}
