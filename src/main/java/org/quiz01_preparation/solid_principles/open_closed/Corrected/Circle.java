package org.quiz01_preparation.solid_principles.open_closed.Corrected;

public class Circle implements Shape{

    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
