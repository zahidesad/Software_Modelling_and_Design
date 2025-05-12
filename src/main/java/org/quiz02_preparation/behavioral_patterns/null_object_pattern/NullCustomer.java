package org.quiz02_preparation.behavioral_patterns.null_object_pattern;

public class NullCustomer implements Customer {
    @Override
    public String getName() {
        return "Not Available";
    }

    @Override
    public boolean isNull() {
        return true;
    }
}
