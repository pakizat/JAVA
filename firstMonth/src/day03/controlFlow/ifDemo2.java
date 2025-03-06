package day03.controlFlow;

/**
 * 完成分支练习 练习内容 汽车根据型号灯驾驶
 */
public class ifDemo2 {
    public static void main(String[] args) {
            autoDriver();
    }
    public static void autoDriver(){
        boolean greenlight = false;
        boolean redlight = false;
        boolean yellowlight = false;
        //生成随机数整数 0、1、2 对应三个灯 0：绿灯 1：红灯 2：黄灯 对应灯值设置为真
        int num = (int)(Math.random()*3);
        System.out.println(num);
        if(num == 0){
            greenlight = true;
        }else if(num == 1){
            redlight = true;
        }else if(num == 2){
            yellowlight = true;
        }else {
            System.out.println("system error");
        }
        //根据随机数生成灯的颜色
        if(greenlight){
            System.out.println("绿灯了");
            System.out.println("开车");
            greenlight = false;
        }else if(redlight){
            System.out.println("红灯了");
            System.out.println("停车");
            redlight = false;
        }else if(yellowlight){
            System.out.println("黄灯了");
            System.out.println("减速观察通过或停车");
            yellowlight = false;
        }else{
            System.out.println("灯故障");
        }



    }
}
