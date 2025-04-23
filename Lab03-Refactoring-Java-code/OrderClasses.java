import java.util.List;

class Order {
    private Customer customer;
    private List<Item> items;

    public Customer getCustomer() {
        return customer;
    }

    public List<Item> getItems() {
        return items;
    }
}

class Customer {
    private String name;

    public String getName() {
        return name;
    }
}

class Item {
    private double price;

    public double getPrice() {
        return price;
    }
}
