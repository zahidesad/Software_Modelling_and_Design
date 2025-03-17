package org.Week03Lab.Example01;

public class MySQLConnection implements DatabaseConnection {

    @Override
    public void connect() {
        System.out.println("Connected to MySQL Database");
    }
}
