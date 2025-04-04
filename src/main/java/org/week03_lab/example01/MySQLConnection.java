package org.week03_lab.example01;

public class MySQLConnection implements DatabaseConnection {

    @Override
    public void connect() {
        System.out.println("Connected to MySQL Database");
    }
}
