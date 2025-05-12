package org.quiz02_preparation.behavioral_patterns.null_object_pattern;

public class RealCustomer implements Customer {
    private final String name;

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isNull() {
        return false;
    }
}
