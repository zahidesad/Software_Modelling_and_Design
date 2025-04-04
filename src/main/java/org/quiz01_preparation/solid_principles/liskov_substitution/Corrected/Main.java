package org.quiz01_preparation.solid_principles.liskov_substitution.Corrected;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5,10);
        Shape square = new Square(7);

        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Square Area: " + square.getArea());
    }
}
