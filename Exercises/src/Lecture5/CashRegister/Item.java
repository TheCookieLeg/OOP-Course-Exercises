package Lecture5.CashRegister;

public class Item {
    private String name;
    private int price;
    private Category category;

    public Item(String name, int price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public enum Category {
        Food,
        Electronics,
        Clothes,
        Toys
    }

    public Category getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

}
