package org.Quiz01Preparation.CreationalPatterns.AbstractFactory;

public class WindowsButton implements Button{
    @Override
    public void paint() {
        System.out.println("Windows Button Created!");
    }
}
