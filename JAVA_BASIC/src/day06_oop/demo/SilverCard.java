package day06_oop.demo;

public class SilverCard extends Card{




    @Override
    public void consumeMoney(double money) {
        money = money * 0.9;
        super.consumeMoney(money);
        System.out.println("银卡消费成功");
    }


}
