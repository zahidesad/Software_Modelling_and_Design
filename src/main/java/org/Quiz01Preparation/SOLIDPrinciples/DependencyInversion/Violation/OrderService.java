package org.Quiz01Preparation.SOLIDPrinciples.DependencyInversion.Violation;

// High level module
public class OrderService {
    private MySQLDatabase database;

    public OrderService() {
        this.database = new MySQLDatabase(); // tight couple
    }

    public void placeOrder(String order) {
        database.saveOrder(order); // MySQL dependent
        System.out.println("Order placed: " + order);
    }
}
