package day06_oop.demo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Card[] cards = new Card[10];
        int count = 0;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag) {
            System.out.println("=========================================");
            System.out.println("欢迎来到银行支付模块");
            System.out.println("请选择功能：\t1.消费 \t2.存款 \t3.办卡 \t4.退出\n");
            int choiceOfBuz = sc.nextInt();
            if (choiceOfBuz == 3) {
                count =addCard(cards, count, sc);
                if (count >= cards.length){
                    flag = false;
                    System.out.println("卡已满，无法继续办卡");
                }
            } else if (choiceOfBuz == 4) {
                flag = false;
                System.out.println("欢迎下次使用");
            } else {
                System.out.println("请输入卡号");
                Card card = verifyCard(sc.nextInt(), cards);
                if (card != null) {
                    switch (choiceOfBuz) {
                        case 1:
                            consumeMoney(card, sc);
                            break;
                        case 2:
                            saveMoney(card, sc);
                            break;
                        default:
                            System.out.println("操作类型输入有误，请重新输入");
                            break;
                    }
                } else {
                    System.out.println("卡号验证失败，请重新输入");
                }
            }
        }
    }

    public static Card verifyCard(int cardID, Card[] cards) {
        Card card = null;
        for (int i = 0; i < cards.length; i++) {
            if (cards[i] != null && cards[i].getCardId() == cardID) {
                System.out.println("卡号验证成功!!\n欢迎" + cards[i].getCardType() + "用户" + cards[i].getOwnerName() + "\n");
                System.out.println("卡中余额为：" + cards[i].getMoney() + "元");
                card = cards[i];
                break;
            }

        }
        return card;
    }

    public static int addCard(Card[] cards, int count, Scanner sc) {
        if (count >= cards.length) {
            System.out.println("卡已满，无法继续办卡");
            return count;
        }

        System.out.println("可办卡类型: 金卡(办理时存入金额需 >= 5000元) \t银卡(办理时存入金额需 >= 2000元)");
        Card card = null;
        System.out.println("请输入办卡类型：");
        String cardType = sc.next();
        if (cardType.equals("金卡")) {
            card = new GoldenCard(); // 创建 GoldenCard 对象
        } else if (cardType.equals("银卡")) {
            card = new SilverCard(); // 创建 SilverCard 对象
        } else {
            System.out.println("卡片类型错误，请重新办卡");
            return count;
        }

        card.setCardId(count + 1); // 卡号从 1 开始
        System.out.println("请输入办卡人姓名：");
        card.setOwnerName(sc.next());
        System.out.println("请输入办卡人手机号：");
        card.setPhoneNumber(sc.next());
        card.setCardType(cardType);
        System.out.println("请输入车牌号：");
        card.setCarNumber(sc.nextInt());
        System.out.println("请输入存入金额：");
        double money = sc.nextDouble();
        if ((cardType.equals("金卡") && money < 5000) || (cardType.equals("银卡") && money < 2000)) {
            System.out.println("存入金额不足，办卡失败");
            return count;
        }

        card.setMoney(money);
        cards[count] = card; // 将新卡添加到数组
        count++; // 增加计数
        System.out.println("办卡成功");
        System.out.println("=========================================1====");
        return count;

    }

    public static void saveMoney(Card c, Scanner sc) {
        System.out.println("请输入存款金额：");
        double money = sc.nextDouble();
        c.saveMoney(money);

    }

    public static void consumeMoney(Card c, Scanner sc) {
        System.out.println("请输入消费金额：");
        double money = sc.nextDouble();
        c.consumeMoney(money);
    }
}
