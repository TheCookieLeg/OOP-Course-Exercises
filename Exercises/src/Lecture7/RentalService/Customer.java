package Lecture7.RentalService;

public class Customer {
    private String name;
    private CustomerType customerType;

    public Customer(String name, CustomerType customerType) {
        this.name = name;
        this.customerType = customerType;
    }

    public String getName() { return name; }
    public CustomerType getCustomerType() { return customerType; }

    @Override
    public String toString() {
        return String.format("Name: %s    Customer type: %s", name, customerType);
    }


    public enum CustomerType {
        PRIVATE,
        BUSINESS
    }
}
