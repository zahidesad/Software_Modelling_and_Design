package org.week03_lab.example04;

public class  MySQLConnection extends DatabaseConnection {
    public MySQLConnection() {
        this.type = "MySQL";
    }

    @Override
    public void connect() {
        System.out.println("Connected to MySQL Database");
    }
}
