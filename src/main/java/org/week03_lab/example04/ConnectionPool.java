package org.week03_lab.example04;

import java.util.HashMap;
import java.util.Map;

public class ConnectionPool {
    private static Map<String, DatabaseConnection> connectionPool = new HashMap<>();

    static {
        connectionPool.put("MySQL", new MySQLConnection());
        connectionPool.put("PostgreSQL", new PostgreSQLConnection());
    }

    public static DatabaseConnection getConnection(String type) {
        try {
            DatabaseConnection prototype = connectionPool.get(type);
            if (prototype != null) {
                return (DatabaseConnection) prototype.clone(); // Return a cloned copy
            } else {
                throw new IllegalArgumentException("Connection type not found: " + type);
            }
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Cloning failed", e);
        }
    }
}
