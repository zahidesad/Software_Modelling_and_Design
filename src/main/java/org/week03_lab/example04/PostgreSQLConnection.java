package org.week03_lab.example04;

public class PostgreSQLConnection extends DatabaseConnection {
    public PostgreSQLConnection() {
        this.type = "PostgreSQL";
    }

    @Override
    public void connect() {
        System.out.println("Connected to PostgreSQL Database");
    }
}