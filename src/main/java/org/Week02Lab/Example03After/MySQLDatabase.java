package org.Week02Lab.Example03After;

public class MySQLDatabase implements IDatabase {
    @Override
    public void saveOrder(String order) {
        System.out.println("Saving order in MySQL: " + order);
    }
}
