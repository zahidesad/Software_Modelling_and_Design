package org.Quiz01Preparation.CreationalPatterns.AbstractFactory;

public class WindowsCheckBox implements CheckBox{

    @Override
    public void paint() {
        System.out.println("Windows CheckBox Created!");
    }
}
