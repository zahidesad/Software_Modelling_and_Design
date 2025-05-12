package org.quiz02_preparation.behavioral_patterns.visitor_pattern;

// Concrete Elements
public class Circle implements IShape{
    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}
