package org.Week03Lab.Example02SeparateMethods;

public class PostgreSQLStandardConnection implements DatabaseConnection {
    @Override
    public void connect() {
        System.out.println("Connected to PostgreSQL Standard Connection");
    }
}
