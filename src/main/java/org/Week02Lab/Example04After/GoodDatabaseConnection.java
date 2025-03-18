package org.Week02Lab.Example04After;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GoodDatabaseConnection {
    private static GoodDatabaseConnection instance;
    private Connection connection;

    private String url;
    private String user;
    private String password;

    private GoodDatabaseConnection(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;

        try {
            this.connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database", e);
        }
    }

    public static GoodDatabaseConnection getInstance(String url, String user, String password) {
        if (instance == null) {
            instance = new GoodDatabaseConnection(url, user, password);
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
}
