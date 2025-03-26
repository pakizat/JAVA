package day06_oop.demo;

public class GoldenCard extends Card{





    @Override
    public void consumeMoney(double money) {
        money = money * 0.8;
        washCarTicket(money);
        super.consumeMoney(money);
        System.out.println("金卡消费成功");
    }

    public static void washCarTicket(double money){
        if( money >= 200){
            System.out.println("实际消费满200，恭喜免费获得一张洗车票");
        }
    }
}
