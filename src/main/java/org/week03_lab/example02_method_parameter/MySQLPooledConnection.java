package org.week03_lab.example02_method_parameter;

public class MySQLPooledConnection implements DatabaseConnection {
    @Override
    public void connect() {
        System.out.println("Connected to MySQL Pooled Connection");
    }
}
