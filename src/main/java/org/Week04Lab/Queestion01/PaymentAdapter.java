package org.Week04Lab.Queestion01;

public class PaymentAdapter implements IAdapter{
    CashPayment cashPayment;

    public PaymentAdapter(CashPayment cp){
        cashPayment = cp;
    }

    @Override
    public void sendPayment(double amount) {
        cashPayment.sendMoney(amount);
    }
}
