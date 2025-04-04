package org.week02_lab.example03_after;

public class GoodDIPExample {
    public static void main(String[] args) {
        IDatabase database = new MySQLDatabase();  // Concrete implementation
        OrderService orderService = new OrderService(database); // Injecting dependency
        orderService.placeOrder("Laptop");
    }
}
