package day04_array.arrayinit;

/**
 * 目标 学习 数组的静态定义
 * 需求 完成 一个 随机点名程序
 */
public class ArrayPracticeDemo1 {
    public static void main(String[] args) {
        String[] names = {"张三","李四","王五","赵六","钱七"};
        System.out.println(randomCall(names));
    }

    public static String randomCall (String[] names){
        int target = (int) (Math.random() * names.length);
        return names[target];
    }
}
