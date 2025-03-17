package src.day03.loop;

/**
 * 使用循环嵌套 打印 乘法表
 */
public class loopTest5 {
    public static void main(String[] args) {
        print99();
    }

    //1.定义一个方法使用循环嵌套 打印 99 乘法表
    public static void print99(){
       //1. 计算机只能按行打印 所以先 确定 行 打印
        for (int i = 1; i <= 9; i++){
            //2. 其次决定每行打印的列数
            for (int j = 1; j <= i; j++){
                System.out.print(j + " " + "*" + " " + i + " " + "=" + " " + j * i+ "    "  );
            }
            System.out.println();
        }
    }
}
