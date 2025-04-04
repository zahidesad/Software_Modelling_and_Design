package org.midterm_preparation.structural_patterns.proxy_design_pattern;

public class RealBank implements Bank {
    @Override
    public void getAccountBalance(String username) {
        System.out.println("Account balance for " + username + ": $10,000");
    }
}


