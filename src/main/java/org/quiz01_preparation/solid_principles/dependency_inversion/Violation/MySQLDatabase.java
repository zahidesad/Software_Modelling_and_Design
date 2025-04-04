package org.quiz01_preparation.solid_principles.dependency_inversion.Violation;

public class MySQLDatabase {
    public void saveOrder(String order) {
        System.out.println("Order saved to MySQL: " + order);
    }
}
