package org.Quiz01Preparation.CreationalPatterns.AbstractFactory;

public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacOSCheckbox();
    }
}
