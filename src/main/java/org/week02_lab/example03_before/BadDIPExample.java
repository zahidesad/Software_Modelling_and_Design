package org.week02_lab.example03_before;

public class BadDIPExample {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        orderService.placeOrder("Laptop");
    }
}
