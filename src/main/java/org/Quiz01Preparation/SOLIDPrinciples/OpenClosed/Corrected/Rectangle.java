package org.Quiz01Preparation.SOLIDPrinciples.OpenClosed.Corrected;

public class Rectangle implements Shape {
    public double width;
    public double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}
