package org.week05_lab.example02;

public class Circle implements Shape {
    private final Color color;

    public Circle(String color) {
        this.color = ColorFactory.getColor(color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle with color: " + color.getName());
    }
}
