package Lecture5.CashRegister;

public class CashRegister {
    private Receipt receipt;

    public CashRegister() { receipt = new Receipt(); }

    public void scan(String barcode) {
        Item t = ProductRange.get().getAssortment().get(barcode);
        receipt.addItem(t);
    }

    public void printReceipt() {
        String s = receipt.getReceipt();
        System.out.println(s);
    }
}
