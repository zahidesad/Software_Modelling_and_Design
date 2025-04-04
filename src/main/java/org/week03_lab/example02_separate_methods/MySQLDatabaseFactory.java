package org.week03_lab.example02_separate_methods;

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
