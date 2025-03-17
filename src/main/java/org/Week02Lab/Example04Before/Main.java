package org.Week02Lab.Example04Before;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        GoodDatabaseConnection dbInstance = GoodDatabaseConnection.getInstance(
                "jdbc:mysql://localhost:3306//e-commerce-website",
                "root",
                "1234"
        );

        Connection conn1 = dbInstance.getConnection();
        Connection conn2 = dbInstance.getConnection();

        System.out.println(conn1 == conn2);
    }
}
