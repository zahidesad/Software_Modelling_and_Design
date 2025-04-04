package org.week03_lab.example01;

public class PostgreSQLConnection implements DatabaseConnection {

    @Override
    public void connect() {
        System.out.println("Connected to PostgreSQL Database");
    }
}
