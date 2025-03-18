package org.Quiz01Preparation.SOLIDPrinciples.DependencyInversion.Corrected;

public class Main {
    public static void main(String[] args) {
        Database mySQL = new MySQLDatabase();
        Database postgreSQL = new PostgreSQLDatabase();

        OrderService service1 = new OrderService(mySQL);
        service1.placeOrder("Laptop");

        OrderService service2 = new OrderService(postgreSQL);
        service2.placeOrder("Phone");
    }
}
