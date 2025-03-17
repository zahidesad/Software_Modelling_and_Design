package org.Week03Lab.Example02MethodParameter;

public class Main {
    public static void main(String[] args) {
        // MySQL Factory
        AbstractDatabaseFactory mySQLFactory = new MySQLDatabaseFactory();
        DatabaseConnection mysqlStandard = mySQLFactory.createConnection("Standard");
        mysqlStandard.connect();

        DatabaseConnection mysqlPooled = mySQLFactory.createConnection("Pooled");
        mysqlPooled.connect();

        // PostgreSQL Factory
        AbstractDatabaseFactory postgreSQLFactory = new PostgreSQLDatabaseFactory();
        DatabaseConnection postgresStandard = postgreSQLFactory.createConnection("Standard");
        postgresStandard.connect();

        DatabaseConnection postgresPooled = postgreSQLFactory.createConnection("Pooled");
        postgresPooled.connect();
    }
}
