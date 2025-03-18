package org.Quiz01Preparation.SOLIDPrinciples.OpenClosed.Corrected;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        Shape circle = new Circle(7);
        Shape triangle = new Triangle(6, 8);

        AreaCalculator calculator = new AreaCalculator();

        System.out.println("Rectangle Area: " + calculator.calculateArea(rectangle));
        System.out.println("Circle Area: " + calculator.calculateArea(circle));
        System.out.println("Triangle Area: " + calculator.calculateArea(triangle));
    }
}
