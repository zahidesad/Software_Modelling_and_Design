package org.quiz01_preparation.solid_principles.dependency_inversion.Corrected;

public class PostgreSQLDatabase implements Database{
    @Override
    public void saveOrder(String order) {
        System.out.println("Order saved to PostgreSQL: " + order);
    }
}
