package org.Week05Lab.Example02;

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
