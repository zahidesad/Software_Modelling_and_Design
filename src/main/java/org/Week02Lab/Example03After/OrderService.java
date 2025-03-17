package org.Week02Lab.Example03After;

public class OrderService {
    private IDatabase database;

    // Use Dependency Injection (constructor-based)
    public OrderService(IDatabase database) {
        this.database = database;
    }

    public void placeOrder(String order) {
        System.out.println("Placing order: " + order);
        database.saveOrder(order);
    }
}
