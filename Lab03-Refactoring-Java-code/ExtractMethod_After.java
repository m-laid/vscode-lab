public class OrderProcessor {
    public void processOrder(Order order) {
        double total = calculateTotal(order);
        printOrderSummary(order.getCustomer(), total);
    }

    private double calculateTotal(Order order) {
        double total = 0;
        for (Item item : order.getItems()) {
            total += item.getPrice();
        }
        return total;
    }

    private void printOrderSummary(Customer customer, double total) {
        System.out.println("Customer: " + customer.getName());
        System.out.println("Total: " + total);
    }
}
