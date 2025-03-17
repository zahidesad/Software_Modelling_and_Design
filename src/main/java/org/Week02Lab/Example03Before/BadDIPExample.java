package org.Week02Lab.Example03Before;

public class BadDIPExample {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        orderService.placeOrder("Laptop");
    }
}
