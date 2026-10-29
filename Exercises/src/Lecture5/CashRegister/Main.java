package Lecture5.CashRegister;

public class Main {
    public static void main(String[] args) {
        CashRegister register = new CashRegister();

        register.scan("1001");
        register.scan("1004");
        register.scan("2002");
        register.scan("3004");
        register.scan("2005");

        register.printReceipt();
    }
}
