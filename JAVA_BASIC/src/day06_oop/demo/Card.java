package day06_oop.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//lombok可以实现getter/setter/toString/equals/hashCode 以及构造器
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Card {
    private int cardId;
    private int carNumber;
    private String ownerName;
    private String phoneNumber;
    private double money;
    private String cardType;

    public void saveMoney(double money){
        if (money > 0) {
            this.money += money;
            System.out.println("存款成功，当前余额：" + getMoney() + "元");
        } else {
            System.out.println("存款失败，金额无效");
        }

    }

    public void consumeMoney(double money){
        if (money > 0 && money <= getMoney()) {
            this.money -= money;
            System.out.println("消费成功，当前余额：" + getMoney() + "元");
        } else {
            System.out.println("消费失败，金额无效或余额不足");
        }
    }
}
