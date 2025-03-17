package org.Week01Lab.Example01AfterComposition;


public class Vehicle {
    IColor colorSetter;

    public Vehicle(IColor colorSetter) {
        this.colorSetter = colorSetter;
    }

    void displayColor() {
        colorSetter.setColor();
    }

}
