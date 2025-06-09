package org.week14_lab.example02;

public class Order {
    private final String orderId;
    private final String product;
    private final int quantity;

    public Order(String orderId, String product, int quantity) {
        this.orderId = orderId;
        this.product = product;
        this.quantity = quantity;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return String.format("[Order id=%s, product=%s, qty=%d]", orderId, product, quantity);
    }
}

