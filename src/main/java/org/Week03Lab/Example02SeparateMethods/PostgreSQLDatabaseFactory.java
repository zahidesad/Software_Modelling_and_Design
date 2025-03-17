package org.Week03Lab.Example02SeparateMethods;

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
