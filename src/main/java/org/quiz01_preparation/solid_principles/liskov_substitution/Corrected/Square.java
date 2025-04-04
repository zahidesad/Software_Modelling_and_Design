package org.quiz01_preparation.solid_principles.liskov_substitution.Corrected;

public class Square implements Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return side * side;
    }
}
