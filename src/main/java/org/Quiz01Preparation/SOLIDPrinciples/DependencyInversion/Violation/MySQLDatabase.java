package org.Quiz01Preparation.SOLIDPrinciples.DependencyInversion.Violation;

public class MySQLDatabase {
    public void saveOrder(String order) {
        System.out.println("Order saved to MySQL: " + order);
    }
}
