package day02.method;

/**
 * 目标 ：掌握方法的声名以及调用
 */
public class MethodDemo1 {
    public static void main(String[] args) {
        System.out.println(getCode(4));
        System.out.println("================================================");

        System.out.println(getCode(5));
        System.out.println("================================================");

        printHelloWorld();
        System.out.println("================================================");
    }

    //定义一个方法 给出指定位数的的验证码
    public static String getCode(int n){
        //定义一个变量用来存储验证码
        String code = "";
        //定义一个循环来生成验证码
        for (int i = 0; i < n; i++) {
            //生成一个随机数
            int num = (int)(Math.random()*10);
            //将随机数拼接到验证码上
            code += num;
        }
        //返回验证码
        return code;
    }
    //定义一个方法用来答应 你好世界
    public static void printHelloWorld(){
        System.out.println("你好世界");
    }

}
