package org.week03_lab.example02_method_parameter;

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


