package org.Week03Lab.Example02MethodParameter;

public class PostgreSQLStandardConnection implements DatabaseConnection {
    @Override
    public void connect() {
        System.out.println("Connected to PostgreSQL Standard Connection");
    }
}
