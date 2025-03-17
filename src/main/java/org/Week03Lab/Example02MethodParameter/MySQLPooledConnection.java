package org.Week03Lab.Example02MethodParameter;

public class MySQLPooledConnection implements DatabaseConnection {
    @Override
    public void connect() {
        System.out.println("Connected to MySQL Pooled Connection");
    }
}
