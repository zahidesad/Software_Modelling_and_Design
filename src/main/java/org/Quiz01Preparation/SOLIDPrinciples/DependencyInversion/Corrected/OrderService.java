package org.Quiz01Preparation.SOLIDPrinciples.DependencyInversion.Corrected;

public class OrderService {
    private Database database;

    public OrderService(Database database) { // Dependency injection
        this.database = database;
    }

    public void placeOrder(String order) {
        database.saveOrder(order);
        System.out.println("Order placed: " + order);
    }
}
