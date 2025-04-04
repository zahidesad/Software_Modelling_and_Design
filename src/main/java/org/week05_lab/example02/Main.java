package org.week05_lab.example02;

public class Main {
    public static void main(String[] args) {
        Shape redCircle1 = new Circle("Red");
        Shape redCircle2 = new Circle("Red");
        Shape blueCircle = new Circle("Blue");

        CompositeShape group = new CompositeShape();
        group.addShape(redCircle1);
        group.addShape(blueCircle);

        CompositeShape mainGroup = new CompositeShape();
        mainGroup.addShape(group);
        mainGroup.addShape(redCircle2);

        mainGroup.draw();
    }
}

