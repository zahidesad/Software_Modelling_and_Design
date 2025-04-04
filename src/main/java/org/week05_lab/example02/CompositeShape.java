package org.week05_lab.example02;

import java.util.ArrayList;
import java.util.List;

public class CompositeShape implements Shape {
    private final List<Shape> children = new ArrayList<>();

    public void addShape(Shape shape) {
        children.add(shape);
    }

    public void removeShape(Shape shape) {
        children.remove(shape);
    }

    @Override
    public void draw() {
        System.out.println("Drawing CompositeShape:");
        for (Shape shape : children) {
            shape.draw();
        }
    }
}

