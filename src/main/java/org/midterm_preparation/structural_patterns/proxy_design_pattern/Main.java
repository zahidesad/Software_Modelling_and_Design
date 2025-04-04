package org.midterm_preparation.structural_patterns.proxy_design_pattern;

public class Main {
    public static void main(String[] args) {
        BankProxy proxy = new BankProxy();

        // Before login
        proxy.getAccountBalance("zahid"); // Access Denied! Please login first.

        // Login process
        proxy.login("zahid", "123"); // Login successful!

        // We can access now
        proxy.getAccountBalance("zahid"); // Account balance for zahid: $10,000
    }
}


