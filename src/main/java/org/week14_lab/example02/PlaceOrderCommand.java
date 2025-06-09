package org.week14_lab.example02;

public class PlaceOrderCommand implements OrderCommand {
    private final OrderService receiver;
    private final Order order;

    public PlaceOrderCommand(OrderService receiver, Order order) {
        this.receiver = receiver;
        this.order    = order;
    }
    @Override
    public void execute() {
        receiver.placeOrder(order);
    }
}

