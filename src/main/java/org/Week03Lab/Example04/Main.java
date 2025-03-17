package org.Week03Lab.Example04;

public class Main {
    public static void main(String[] args) {
        DatabaseConnection mysql1 = ConnectionPool.getConnection("MySQL");
        DatabaseConnection mysql2 = ConnectionPool.getConnection("MySQL");
        DatabaseConnection postgres = ConnectionPool.getConnection("PostgreSQL");

        // Connect using retrieved connections
        mysql1.connect();
        mysql2.connect();
        postgres.connect();

        // Verify if mysql1 and mysql2 are separate instances
        System.out.println("mysql1 == mysql2? " + (mysql1 == mysql2)); // Should print false (cloned copies)
    }
}
