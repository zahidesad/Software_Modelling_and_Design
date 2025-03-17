package org.Week02Lab.Example03Before;

public class OrderService {
    private MySQLDatabase database;

    public OrderService() {
        this.database = new MySQLDatabase();
    }

    public void placeOrder(String order) {
        System.out.println("Placing order: " + order);
        database.saveOrder(order);
    }
}
