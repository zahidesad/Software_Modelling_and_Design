package org.Week02Lab.Example04After;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {

        BadDatabaseConnection db1 = new BadDatabaseConnection();
        BadDatabaseConnection db2 = new BadDatabaseConnection();

        Connection conn1 = db1.getConnection();
        Connection conn2 = db2.getConnection();

        System.out.println(conn1 == conn2);
    }
}
