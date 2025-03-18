package org.Quiz01Preparation.CreationalPatterns.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        GUIFactory factory;

        String osType = "macOS";

        if (osType.equals("Windows")) {
            factory = new WindowsFactory();
        } else {
            factory = new MacOSFactory();
        }

        Button button = factory.createButton();
        CheckBox checkBox = factory.createCheckBox();

        button.paint();
        checkBox.paint();
    }
}
