package org.Week04Lab.Queestion01;

public class Client {
    public static void main(String[] args) {
        IAdapter adapter = new CreditCardPayment();
        adapter.sendPayment(1500);

        IAdapter adapter2 = new PaymentAdapter(new CashPayment());
        adapter2.sendPayment(1500);

    }
}
