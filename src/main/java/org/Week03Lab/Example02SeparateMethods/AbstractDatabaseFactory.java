package org.Week03Lab.Example02SeparateMethods;

public interface AbstractDatabaseFactory {
    DatabaseConnection createStandardConnection();
    DatabaseConnection createPooledConnection();
}
