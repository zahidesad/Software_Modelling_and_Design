package org.Week03Lab.Example02SeparateMethods;

public class PostgreSQLPooledConnection implements DatabaseConnection {
    @Override
    public void connect() {
        System.out.println("Connected to PostgreSQL Pooled Connection");
    }
}
