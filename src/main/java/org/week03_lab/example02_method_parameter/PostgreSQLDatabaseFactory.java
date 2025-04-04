package org.week03_lab.example02_method_parameter;

public class PostgreSQLDatabaseFactory implements AbstractDatabaseFactory {
    @Override
    public DatabaseConnection createConnection(String connectionType) {
        if (connectionType.equalsIgnoreCase("Standard")) {
            return new PostgreSQLStandardConnection();
        } else if (connectionType.equalsIgnoreCase("Pooled")) {
            return new PostgreSQLPooledConnection();
        } else {
            throw new IllegalArgumentException("Unknown PostgreSQL connection type: " + connectionType);
        }
    }
}
