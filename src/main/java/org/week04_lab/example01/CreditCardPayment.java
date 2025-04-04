package org.week04_lab.example01;

// New
public class CreditCardPayment implements IAdapter{

    @Override
    public void sendPayment(double amount) {
        System.out.println("Credit Card charged: $" + amount);
    }
}
