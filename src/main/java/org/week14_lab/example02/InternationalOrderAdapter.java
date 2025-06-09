package org.week14_lab.example02;


public class InternationalOrderAdapter implements OrderCommand {
    private final InternationalSalesService adaptee;
    private final Order order;

    public InternationalOrderAdapter(InternationalSalesService adaptee, Order order) {
        this.adaptee = adaptee;
        this.order   = order;
    }
    @Override
    public void execute() {
        adaptee.internationalPlaceOrder(
                order.getOrderId(),
                order.getProduct(),
                order.getQuantity()
        );
    }
}

