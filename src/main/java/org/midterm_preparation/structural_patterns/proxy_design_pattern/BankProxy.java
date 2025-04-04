package org.midterm_preparation.structural_patterns.proxy_design_pattern;

public class BankProxy implements Bank {
    private RealBank realBank = new RealBank();
    private boolean isLoggedIn;

    public void login(String username, String password) {
        if (username.equals("zahid") && password.equals("123")) {
            isLoggedIn = true;
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed!");
        }
    }

    @Override
    public void getAccountBalance(String username) {
        if (isLoggedIn) {
            realBank.getAccountBalance(username);
        } else {
            System.out.println("Access Denied! Please login first.");
        }
    }
}


