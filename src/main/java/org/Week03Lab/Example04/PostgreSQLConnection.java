package org.Week03Lab.Example04;

public class PostgreSQLConnection extends DatabaseConnection {
    public PostgreSQLConnection() {
        this.type = "PostgreSQL";
    }

    @Override
    public void connect() {
        System.out.println("Connected to PostgreSQL Database");
    }
}