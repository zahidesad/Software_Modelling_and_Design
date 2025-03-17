package org.Week03Lab.Example02MethodParameter;


public class MySQLStandardConnection implements DatabaseConnection {
    @Override
    public void connect() {
        System.out.println("Connected to MySQL Standard Connection");
    }
}
