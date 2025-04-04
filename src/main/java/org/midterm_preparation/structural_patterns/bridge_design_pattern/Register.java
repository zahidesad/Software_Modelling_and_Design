package org.midterm_preparation.structural_patterns.bridge_design_pattern;

public class Register implements StudentAction{

    @Override
    public void action() {
        System.out.println("Registered");
    }
}
