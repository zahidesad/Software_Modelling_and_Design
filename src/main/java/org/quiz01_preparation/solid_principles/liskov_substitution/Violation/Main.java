package org.quiz01_preparation.solid_principles.liskov_substitution.Violation;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Square();  // LSP violation
        rectangle.setWidth(5);
        rectangle.setHeight(10);

        System.out.println("Expected Area: 5 * 10 = 50");
        System.out.println("Actual Area: " + rectangle.getArea());  // Not the expected result!
    }
}
