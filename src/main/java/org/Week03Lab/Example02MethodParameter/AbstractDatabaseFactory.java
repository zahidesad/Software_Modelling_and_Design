package org.Week03Lab.Example02MethodParameter;

public interface AbstractDatabaseFactory {
    DatabaseConnection createConnection(String connectionType);
}
