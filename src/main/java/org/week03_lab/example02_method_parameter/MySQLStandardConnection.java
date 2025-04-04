package org.week03_lab.example02_method_parameter;


public class MySQLStandardConnection implements DatabaseConnection {
    @Override
    public void connect() {
        System.out.println("Connected to MySQL Standard Connection");
    }
}
