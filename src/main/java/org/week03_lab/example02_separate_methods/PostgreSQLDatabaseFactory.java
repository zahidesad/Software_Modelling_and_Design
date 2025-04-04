package org.week03_lab.example02_separate_methods;

public class PostgreSQLDatabaseFactory implements AbstractDatabaseFactory {
    @Override
    public DatabaseConnection createStandardConnection() {
        return new PostgreSQLStandardConnection();
    }

    @Override
    public DatabaseConnection createPooledConnection() {
        return new PostgreSQLPooledConnection();
    }
}
