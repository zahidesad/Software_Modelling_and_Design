package org.quiz01_preparation.creational_patterns.abstract_factory;

public class WindowsCheckBox implements CheckBox{

    @Override
    public void paint() {
        System.out.println("Windows CheckBox Created!");
    }
}
