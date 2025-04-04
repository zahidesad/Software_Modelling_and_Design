package org.week03_lab.example01;

public class Main {
    public static void main(String[] args) {
        DatabaseConnection mysqlConn = DatabaseConnectionFactory.getConnection("MySQL");
        mysqlConn.connect();

        DatabaseConnection postgresConn = DatabaseConnectionFactory.getConnection("PostgreSQL");
        postgresConn.connect();
    }
}