public enum Coffee {
    CAPPUCCINO(1,"Капучино", 150), ESPRESSO(2,"Эспрессо", 100), LATTE(3,"Латте", 180), COFFEE(4,"Американо",100);

    private int number;
    private String title;
    private int price;

    Coffee(int number, String title, int price) {
        this.number = number;
        this.title = title;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }
    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

}