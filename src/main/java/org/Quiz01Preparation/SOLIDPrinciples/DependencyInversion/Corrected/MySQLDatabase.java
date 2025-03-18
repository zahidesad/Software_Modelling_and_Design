package org.Quiz01Preparation.SOLIDPrinciples.DependencyInversion.Corrected;

public class MySQLDatabase implements Database {

    @Override
    public void saveOrder(String order) {
        System.out.println("Order saved to MySQL: " + order);
    }
}
