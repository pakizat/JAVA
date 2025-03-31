package day07_oop.demo;

public class TV extends JD implements Switch{

    public TV(String name, boolean status) {
        super(name, status);
    }
    @Override
    public void Switcher() {
        //根据自有逻辑执行开关
        //设置开关信号
        super.setStatus(!super.isStatus());

    }
}
