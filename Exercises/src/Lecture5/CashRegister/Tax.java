package Lecture5.CashRegister;

public class Tax {
    private static Tax instance = null;

    public static Tax get() {
        if (instance == null)
            instance = new Tax();
        return instance;
    }

    public Tax() {}

    public int calculateTax(int price) {
        return (int) (price * 0.25);
    }

    public int calculatePriceWithTax(int price) {
        return ((int) (price * 0.25)) + price;
    }

}
