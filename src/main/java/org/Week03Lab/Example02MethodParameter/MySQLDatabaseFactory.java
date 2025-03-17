package org.Week03Lab.Example02MethodParameter;

public class MySQLDatabaseFactory implements AbstractDatabaseFactory {
    @Override
    public DatabaseConnection createConnection(String connectionType) {
        if (connectionType.equalsIgnoreCase("Standard")) {
            return new MySQLStandardConnection();
        } else if (connectionType.equalsIgnoreCase("Pooled")) {
            return new MySQLPooledConnection();
        } else {
            throw new IllegalArgumentException("Unknown MySQL connection type: " + connectionType);
        }
    }
}


