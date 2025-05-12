package org.quiz02_preparation.behavioral_patterns.null_object_pattern;

public class Client {
    public static void main(String[] args) {
        Customer c1 = CustomerFactory.getCustomer("Alice");
        Customer c2 = CustomerFactory.getCustomer("David"); // not in the list (KNOWN)

        printCustomer(c1);
        printCustomer(c2);
    }

    private static void printCustomer(Customer cust) {
        System.out.printf("Customer name: %s (isNull=%b)%n",
                cust.getName(), cust.isNull());
    }
}
