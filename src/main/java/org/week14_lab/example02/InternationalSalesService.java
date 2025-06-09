package org.week14_lab.example02;

public class InternationalSalesService {

    public void internationalPlaceOrder(String externalOrderId, String productCode, int qty) {
        System.out.printf(">>> [InternationalSales] orderId=%s, product=%s, qty=%d%n",
                externalOrderId, productCode, qty);
    }
}

