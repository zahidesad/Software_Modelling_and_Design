package org.Quiz01Preparation.CreationalPatterns.AbstractFactory;

public class MacOSCheckbox implements CheckBox {

    @Override
    public void paint() {
        System.out.println("macOS Checkbox Created!");
    }

}
