package org.final_prep.qs1;

public class PlaceOrderCommand implements Command {
    Order order;

    public PlaceOrderCommand(Order order) {
        this.order = order;
    }

    @Override
    public void execute() {
        order.placeOrder();
        System.out.println("Place order command");
    }
}
