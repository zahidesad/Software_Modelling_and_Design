package org.quiz01_preparation.creational_patterns.abstract_factory;

public class WindowsButton implements Button{
    @Override
    public void paint() {
        System.out.println("Windows Button Created!");
    }
}
