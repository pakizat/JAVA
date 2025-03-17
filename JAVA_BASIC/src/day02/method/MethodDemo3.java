package src.day02.method;

/**
 * 目标 ： 掌握 在无返回值方法中 使用 return;来终止 方法的执行
 */
public class MethodDemo3 {
    public static void main(String[] args) {
        printDivision(10,0);
        System.out.println("================================================");
        printDivision(10,2);
        System.out.println("================================================");
    }
    //定义一个方法 计算除法
    public static void printDivision(int a,int b){
        if (b == 0){
            System.out.println("除数不能为0");
            return;
        }
        System.out.println(a/b);
    }
}
