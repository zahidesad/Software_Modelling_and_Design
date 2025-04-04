package org.week03_lab.example02_separate_methods;

public class MySQLPooledConnection implements DatabaseConnection{
    @Override
    public void connect() {
        System.out.println("Connected to MySQL Pooled Connection");
    }
}
