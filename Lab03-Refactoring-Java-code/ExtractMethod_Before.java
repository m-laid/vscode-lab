public class OrderProcessor {
    public void processOrder(Order order) {
        double total = 0;
        for (Item item : order.getItems()) {
            total += item.getPrice();
        }
        System.out.println("Customer: " + order.getCustomer().getName());
        System.out.println("Total: " + total);
    }
}
