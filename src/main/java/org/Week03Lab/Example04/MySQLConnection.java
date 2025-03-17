package org.Week03Lab.Example04;

public class  MySQLConnection extends DatabaseConnection {
    public MySQLConnection() {
        this.type = "MySQL";
    }

    @Override
    public void connect() {
        System.out.println("Connected to MySQL Database");
    }
}
