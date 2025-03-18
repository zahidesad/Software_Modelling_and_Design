package org.Quiz01Preparation.SOLIDPrinciples.DependencyInversion.Corrected;

public class PostgreSQLDatabase implements Database{
    @Override
    public void saveOrder(String order) {
        System.out.println("Order saved to PostgreSQL: " + order);
    }
}
