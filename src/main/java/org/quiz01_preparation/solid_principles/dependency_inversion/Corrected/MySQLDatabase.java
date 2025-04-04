package org.quiz01_preparation.solid_principles.dependency_inversion.Corrected;

public class MySQLDatabase implements Database {

    @Override
    public void saveOrder(String order) {
        System.out.println("Order saved to MySQL: " + order);
    }
}
