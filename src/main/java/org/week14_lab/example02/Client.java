package org.week14_lab.example02;

public class Client {
    public static void main(String[] args) {

        Order order1 = new Order("A100", "Widget", 5);
        Order order2 = new Order("B200", "Gadget", 2);

        OrderService localService = new OrderService();
        OrderCommand placeLocal   = new PlaceOrderCommand(localService, order1);
        OrderCommand cancelLocal  = new CancelOrderCommand(localService, order1);


        InternationalSalesService intlService = new InternationalSalesService();
        OrderCommand placeIntl = new InternationalOrderAdapter(intlService, order2);


        OrderInvoker invoker = new OrderInvoker();


        invoker.setCommand(placeLocal);
        invoker.invoke();


        invoker.setCommand(cancelLocal);
        invoker.invoke();


        invoker.setCommand(placeIntl);
        invoker.invoke();
    }
}
