package org.quiz02_preparation.behavioral_patterns.null_object_pattern;

public class CustomerFactory {
    private static final String [] KNOWN = { "Alice", "Bob", "Charlie" };

    public static Customer getCustomer(String name) {
        for (String n : KNOWN) {
            if (n.equalsIgnoreCase(name)) {
                return new RealCustomer(n);
            }
        }
        return new NullCustomer();
    }
}
