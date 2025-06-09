package org.week14_lab.example02;

public class CancelOrderCommand implements OrderCommand {
    private final OrderService receiver;
    private final Order order;
    
    public CancelOrderCommand(OrderService receiver, Order order) {
        this.receiver = receiver;
        this.order    = order;
    }
    @Override
    public void execute() {
        receiver.cancelOrder(order);
    }
}

