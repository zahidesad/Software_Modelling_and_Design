package org.week03_lab.example02_separate_methods;

public class PostgreSQLStandardConnection implements DatabaseConnection {
    @Override
    public void connect() {
        System.out.println("Connected to PostgreSQL Standard Connection");
    }
}
