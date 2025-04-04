package org.midterm_preparation.structural_patterns.flyweight_pattern;

public class Circle implements Shape {
    private String color; // Intrinsic state

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Circle: Draw() [Color: " + color + "]");
    }
}

