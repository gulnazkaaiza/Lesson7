public class Display {

    public static void startMessage() {
        System.out.println(" Нажмите кнопку 1 - Посмотреть весь список товаров; \n Нажмите кнопку 2 - Внести деньги на счет; \n Нажмите кнопку 3 - Узнать текущий баланс; \n Нажмите кнопку 4 - Совершить покупку ");
    }

    public static void listAllcoffee() {
        for (Coffee list : Coffee.values()
        ) {
            System.out.println(list.getNumber() + ". " + list.getTitle() + "  " + list.getPrice() + " рублей");
        }
    }
}


