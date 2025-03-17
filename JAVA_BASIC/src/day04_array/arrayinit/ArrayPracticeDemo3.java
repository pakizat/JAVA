package src.day04_array.arrayinit;

/**
 * 目标 ： 完成扑克牌游戏的两项功能 一个是创建新牌 然后对此进行洗牌
 */
public class ArrayPracticeDemo3 {
    //定义一个数组来存储卡牌
    static String[] poker = new String[54];

    public static void main(String[] args) {
        createPoker();
        randomPoker();
    }


    //1. 首先创建新牌
    public static String[] createPoker() {
        //定义卡牌需要的元素
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A","2"};
        String[] suits = {"♠", "♡", "♢", "♣"};
        int index = 0;
        //按照顺序创造卡牌
        for (int i = 0; i < number.length ; i++) {
            for (int j = 0; j < 4 ; j++) {
            poker[index++] = number[i] + suits[j];

            }
        }

        //插入大小王
        poker[index++] = "大王";
        poker[index] = "小王";

        //输出新创卡牌
        System.out.println("新牌：");
        for (int i = 0; i < poker.length; i++) {
            System.out.print(poker[i] + " ");
        }
        System.out.println();
        return poker;
    }

    //2.进行洗牌操作
    public static void randomPoker() {
        for (int i = 0; i < poker.length; i++) {
            String temp = null;
            temp = poker[i];
            poker[i] = poker[(int) (Math.random() * poker.length)];
            poker[(int) (Math.random() * poker.length)] = temp;
        }

        //输出洗完后的牌
        System.out.println("洗完后的牌：");
        for (int i = 0; i < poker.length; i++) {
            System.out.print(poker[i] + " ");
        }
    }
}
