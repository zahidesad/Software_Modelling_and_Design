package org.midterm_preparation.structural_patterns.decorator_design_pattern;

public class Test {
    public static void main(String[] args) {
        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();

        System.out.println("---------------------------");

        ShapeDecorator redShapeDecorator = new RedShapeDecorator(new Rectangle());
        redShapeDecorator.draw();
    }
}
