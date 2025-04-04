package org.midterm_preparation.structural_patterns.facade_design_pattern;

public class Main {
    public static void main(String[] args) {
        FacadeForSystem facade = new FacadeForSystem();
        facade.callSubsystems();
    }
}
