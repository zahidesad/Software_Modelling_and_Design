package org.week03_lab.example02_method_parameter;

public interface AbstractDatabaseFactory {
    DatabaseConnection createConnection(String connectionType);
}
