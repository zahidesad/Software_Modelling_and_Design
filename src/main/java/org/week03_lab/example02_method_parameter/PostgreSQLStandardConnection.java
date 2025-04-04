package org.week03_lab.example02_method_parameter;

public class PostgreSQLStandardConnection implements DatabaseConnection {
    @Override
    public void connect() {
        System.out.println("Connected to PostgreSQL Standard Connection");
    }
}
