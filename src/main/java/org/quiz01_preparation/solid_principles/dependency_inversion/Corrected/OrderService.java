package org.quiz01_preparation.solid_principles.dependency_inversion.Corrected;

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
