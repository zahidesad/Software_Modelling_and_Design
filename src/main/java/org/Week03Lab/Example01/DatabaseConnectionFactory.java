package org.Week03Lab.Example01;

class DatabaseConnectionFactory {
    public static DatabaseConnection getConnection(String type) {
        if (type.equalsIgnoreCase("MySQL")) {
            return new MySQLConnection();
        } else if (type.equalsIgnoreCase("PostgreSQL")) {
            return new PostgreSQLConnection();
        } else {
            throw new IllegalArgumentException("Unknown database type: " + type);
        }
    }
}
