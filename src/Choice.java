import java.util.Scanner;

public class Choice {
    public void Choice(int choice) {
        Scanner yourMoney = new Scanner(System.in);
        Scanner yourDrink= new Scanner(System.in);

        Money money = new Money(0);

        switch (choice) {
            case 1:
                Display.listAllcoffee();
                Display.startMessage();
                System.out.print("\n");
                break;
            case 2:
                System.out.println("Введите сумму: ");
                money.giveMoney(yourMoney.nextInt());
                Money.currentOfMoney();
                Display.startMessage();
                System.out.print("\n");
                break;
            case 3:
                Money.currentOfMoney();
                Display.startMessage();
                System.out.print("\n");
                break;
            case 4:
                System.out.println("Выберите напиток:");
                Display.listAllcoffee();
                while (true) {
                    int drinkChoice = yourDrink.nextInt();
                    if (drinkChoice == 0){
                        break;
                    }
                    for (Coffee list : Coffee.values()
                    ) {
                        if (drinkChoice == list.getNumber()) {
                            if (money.getCurrentMoney() - list.getPrice() >= 0) {
                                System.out.println("Вы купили");
                                money.moneyAfterPurchase(list.getPrice());
                                Money.currentOfMoney();
                            } else {
                                System.out.println("Недостаточно средств для покупки. Текущий баланс: " + Money.getCurrentMoney());
                            }
                            break;
                        }
                    }
                    System.out.println("Такого Напитка нет. Повторите ввод:");
                    Display.listAllcoffee();

                }
                Display.startMessage();
                break;
            default:
                Display.startMessage();
                System.out.print("\n");
        }
    }


}