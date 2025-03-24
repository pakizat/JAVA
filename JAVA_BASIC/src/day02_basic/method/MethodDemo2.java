package day02_basic.method;

/**
 * 目标： 认识重载方法
 */

public class MethodDemo2 {
    public static void main(String[] args) {
        printVariable();
        System.out.println("================================================");
        printVariable(10);
        System.out.println("================================================");
        printVariable(10,20);
        System.out.println("================================================");
        printVariable(10.0,20.0);
        System.out.println("================================================");
        printVariable(10,20.0);
        System.out.println("================================================");
        printVariable(10.0);
        System.out.println("================================================");

    }
    //定义重载的方法
    public static void printVariable(){
        System.out.println("printVariable");
    }
    public static void printVariable(int a){
        System.out.println("printVariable(int a)");
    }
    public static void printVariable(double a){
        System.out.println("printVariable(double a)");
    }
    public static void printVariable(int a,int b){
        System.out.println("printVariable(int a,int b)");
    }
    public static void printVariable(double a,double b){
        System.out.println("printVariable(double a,double b)");
    }
    public static void printVariable(int a,double b){
        System.out.println("printVariable(int a,double b)");
    }
}
