public class Money {

    public static int money;


    public Money(int money) {

        this.money = money;
    }

    public static int getCurrentMoney(){

        return money;
    }

    public void giveMoney(int giveMoney){

        this.money += giveMoney;
    }

    public static void currentOfMoney(){

        System.out.println("Текущий баланс: " + Money.getCurrentMoney());
    }


    public void moneyAfterPurchase(int purchase){

        this.money -= purchase;
    }

}

