package org.quiz02_preparation.behavioral_patterns.visitor_pattern;


import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<IShape> shapes = new ArrayList<>();
        shapes.add(new Circle());
        shapes.add(new Square());
        shapes.add(new Triangle());

        AreaCalculator areaCalculator = new AreaCalculator();

        for (IShape shape : shapes) {
            shape.accept(areaCalculator);
        }

        System.out.println("Total area: " + areaCalculator.getTotalArea());

    }
}
