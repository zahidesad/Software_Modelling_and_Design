package org.week03_lab.example02_separate_methods;

public class Main {
    public static void main(String[] args) {
        // MySQL Factory
        AbstractDatabaseFactory mySQLFactory = new MySQLDatabaseFactory();
        DatabaseConnection mysqlStandard = mySQLFactory.createStandardConnection();
        mysqlStandard.connect();

        DatabaseConnection mysqlPooled = mySQLFactory.createPooledConnection();
        mysqlPooled.connect();

        // PostgreSQL Factory
        AbstractDatabaseFactory postgreSQLFactory = new PostgreSQLDatabaseFactory();
        DatabaseConnection postgresStandard = postgreSQLFactory.createStandardConnection();
        postgresStandard.connect();

        DatabaseConnection postgresPooled = postgreSQLFactory.createPooledConnection();
        postgresPooled.connect();
    }
}

