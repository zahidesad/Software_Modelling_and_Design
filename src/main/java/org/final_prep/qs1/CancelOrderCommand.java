package org.final_prep.qs1;

public class CancelOrderCommand implements Command{
    Order order;

    public CancelOrderCommand(Order order) {
        this.order = order;
    }

    @Override
    public void execute() {
        order.cancelOrder();
        System.out.println("Cancel Order Command");
    }
}
