package src.day03.loop;

/**
 * while 使用案例
 */
public class WhileDemo4 {
    public static void main(String[] args) {
        demo1();
    }

    //1.珠穆朗玛峰 高8848.86m 即换算成毫米为8848860  一张纸的厚度为 0.1毫米 问纸张这得多少次 可以 达到珠峰高度
    public static void demo1(){
        int i = 0;
        double height = 0;
        while(height < 8848860){
            i++;
            height = 0.1 * Math.pow(2,i);
            Double a = height;

        }
        System.out.println(i);
    }
}
