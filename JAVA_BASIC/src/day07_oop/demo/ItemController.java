package day07_oop.demo;

//服务控制类使用单实例模型
public class ItemController {
    //2.定义一个类变量记住一个类的对象
    private static  ItemController itemController = new ItemController();


    //1. 私有化构造器
    private ItemController(){
    }

    //3.定义一个公共的静态方法，返回类的对象
    public static ItemController getInstance(){
        return itemController;
    }

    public void Switch(JD jd){
        System.out.println("======================================");
        System.out.println("现在设备" + jd.getName() + "的状态是" + (jd.isStatus() ? "开" : "关"));
        System.out.println("正在执行操作中");
        jd.Switcher();
        System.out.println("现在设备" + jd.getName() + "的状态改变为了" + (jd.isStatus() ? "开" : "关"));
    }
    
    public void totalStatus(JD[] jds){
        for (int i = 0; i < jds.length; i++) {
            System.out.println(i+1 + "." + jds[i].getName() + "状态为：" + (jds[i].isStatus() ? "开" : "关"));
        }
    }

}
