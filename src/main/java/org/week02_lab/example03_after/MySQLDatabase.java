package org.week02_lab.example03_after;

public class MySQLDatabase implements IDatabase {
    @Override
    public void saveOrder(String order) {
        System.out.println("Saving order in MySQL: " + order);
    }
}
