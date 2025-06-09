package org.week14_lab.example02;

public class OrderService {

    public void placeOrder(Order order) {
        System.out.println("Placing order in local system: " + order);

    }
    public void cancelOrder(Order order) {
        System.out.println("Cancelling order in local system: " + order);
    }
}

