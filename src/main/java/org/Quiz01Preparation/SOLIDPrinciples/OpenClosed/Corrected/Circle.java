package org.Quiz01Preparation.SOLIDPrinciples.OpenClosed.Corrected;

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
