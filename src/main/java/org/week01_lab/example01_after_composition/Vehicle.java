package org.week01_lab.example01_after_composition;


public class Vehicle {
    IColor colorSetter;

    public Vehicle(IColor colorSetter) {
        this.colorSetter = colorSetter;
    }

    void displayColor() {
        colorSetter.setColor();
    }

}
