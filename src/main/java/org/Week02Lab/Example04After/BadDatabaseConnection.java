package org.Week02Lab.Example04After;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BadDatabaseConnection {
    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "user", "password");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
