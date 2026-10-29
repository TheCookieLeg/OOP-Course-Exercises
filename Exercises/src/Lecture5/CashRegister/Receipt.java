package Lecture5.CashRegister;

import java.util.ArrayList;

public class Receipt {
    private ArrayList<Item> receiptItems;

    public Receipt() {
        receiptItems = new ArrayList<Item>();
    }


    public String getReceipt() {
        String result = "";
        for (int i = 1; i <= receiptItems.size(); i++) {
            Item temp = receiptItems.get(i-1);
            String s = String.format("Item %d: Name: %s    ;     price w/o: %d    ;    price w: %d\n", i, temp.getName(), temp.getPrice(), Tax.get().calculatePriceWithTax(temp.getPrice()));
            result = String.join("", result, s);
        }
        String t = String.format("Total w/o: %d    ;    w: %d\n", calcPriceWithoutTax(), calcPriceWithTax());
        result = String.join("", result, t);
        return result;
    }

    public void addItem(Item t) {
        receiptItems.add(t);
    }

    public int calcPriceWithTax() {
        int sum = 0;
        for (Item t : receiptItems) {
            sum += Tax.get().calculatePriceWithTax(t.getPrice());
        }
        return sum;
    }

    public int calcPriceWithoutTax() {
        int sum = 0;
        for (Item t : receiptItems) {
            sum += t.getPrice();
        }
        return sum;
    }

}
