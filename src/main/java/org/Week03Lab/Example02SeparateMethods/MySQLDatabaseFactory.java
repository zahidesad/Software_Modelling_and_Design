package org.Week03Lab.Example02SeparateMethods;

public class MySQLDatabaseFactory implements AbstractDatabaseFactory{
    @Override
    public DatabaseConnection createStandardConnection() {
        return new MySQLStandardConnection();
    }

    @Override
    public DatabaseConnection createPooledConnection() {
        return new MySQLPooledConnection();
    }
}
