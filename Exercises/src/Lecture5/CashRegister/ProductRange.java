package Lecture5.CashRegister;

import java.util.HashMap;
import java.util.Map;

public class ProductRange {
    private static ProductRange instance = null;
    private HashMap<String, Item> assortment = new HashMap<String, Item>();

    public static ProductRange get() {
        if (instance == null)
            instance = new ProductRange();
        return instance;
    }

    public ProductRange() {
        // Food
        assortment.put("1001", new Item("Milk", 10, Item.Category.Food));
        assortment.put("1002", new Item("Cheese", 20, Item.Category.Food));
        assortment.put("1003", new Item("Bread", 15, Item.Category.Food));
        assortment.put("1004", new Item("Butter", 18, Item.Category.Food));
        assortment.put("1005", new Item("Eggs", 25, Item.Category.Food));
        assortment.put("1006", new Item("Apples", 12, Item.Category.Food));
        assortment.put("1007", new Item("Chicken", 45, Item.Category.Food));
        assortment.put("1008", new Item("Rice", 22, Item.Category.Food));

        // Cloth
        assortment.put("2001", new Item("T-Shirt", 80, Item.Category.Clothes));
        assortment.put("2002", new Item("Jeans", 250, Item.Category.Clothes));
        assortment.put("2003", new Item("Socks", 30, Item.Category.Clothes));
        assortment.put("2004", new Item("Jacket", 400, Item.Category.Clothes));
        assortment.put("2005", new Item("Hoodie", 180, Item.Category.Clothes));

        // Electronics
        assortment.put("3001", new Item("Headphones", 199, Item.Category.Electronics));
        assortment.put("3002", new Item("Mouse", 149, Item.Category.Electronics));
        assortment.put("3003", new Item("Keyboard", 299, Item.Category.Electronics));
        assortment.put("3004", new Item("USB Cable", 49, Item.Category.Electronics));
        assortment.put("3005", new Item("Charger", 99, Item.Category.Electronics));
    }

    public HashMap<String, Item> getAssortment() { return assortment; }

}
