package src.day03_flowcontrol.practice;

import java.util.Scanner;

/**
 * 综合案例 ： 验证码生成器
 *  目标 ： 可以按指定位数 生成 包含数字或大小写字母的验证码
 */
public class GenerateCodeDemo3 {
    public static void main(String[] args) {
        //1.方法调用
        System.out.println("请输入需要的验证码位数");
        Scanner sc = new Scanner(System.in);
        System.out.println(generateCode(sc.nextInt()));

    }

    //1.程序方法实现方式一
    public static String generateCode(int length) {
        String code = "";

        for(int i = 0; i < length; i++) {
            //1.确定验证码字符类型 0 数字 1 大写字母 2 小写字母
            int type = (int) (Math.random() * 3);
            //2. 根据生成的类型 生成对应的字符
            switch (type) {
                case 0:
                    int num = (int) (Math.random() * 10);
                    code += num;
                    break;
                //3. 关于字母部分 'A' ascii码值 为 65 'Z' ascii码值 为 90 'a' ascii码值 为 97 'z' ascii码值 为 122
                // 所以可以通过随机数 * 26 + 'A' 或者 * 26 + 'a' 来生成对应的字母
                case 1:
                    char ch = (char) (Math.random() * 26 + 'A');
                    code += ch;
                    break;
                case 2:
                    char ch2 = (char) (Math.random() * 26 + 'a');
                    code += ch2;
                    break;
            }
        }
        return code;
    }
}
