package Lecture7.RentalService;

public class Vehicle {
    private String modelName;
    private Category category;
    private double dailyPriceDKK;

    public Vehicle(String modelName, Category category, double dailyPriceDKK) {
        this.modelName = modelName;
        this.category = category;
        this.dailyPriceDKK = dailyPriceDKK;
    }

    public String getModelName() { return modelName; }
    public Category getCategory() { return category; }
    public double getDailyPriceDKK() { return dailyPriceDKK; }


    @Override
    public String toString() {
        return String.format("Category: %s    Model: %s,    price per day: %f",
                this.category,
                this.modelName,
                this.dailyPriceDKK);
    }

    public enum Category {
        CAR,
        VAN,
        BICYCLE
    }
}
