package org.Quiz01Preparation.CreationalPatterns.AbstractFactory;

public class MacOSButton implements Button{

    @Override
    public void paint() {
        System.out.println("macOS Button Created!");
    }
}
