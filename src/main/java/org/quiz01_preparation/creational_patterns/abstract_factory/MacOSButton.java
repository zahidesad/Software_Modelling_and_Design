package org.quiz01_preparation.creational_patterns.abstract_factory;

public class MacOSButton implements Button{

    @Override
    public void paint() {
        System.out.println("macOS Button Created!");
    }
}
