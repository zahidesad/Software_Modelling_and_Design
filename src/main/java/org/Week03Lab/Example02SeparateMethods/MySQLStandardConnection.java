package org.Week03Lab.Example02SeparateMethods;

public class MySQLStandardConnection implements DatabaseConnection {
    @Override
    public void connect() {
        System.out.println("Connected to MySQL Standard Connection");
    }
}
