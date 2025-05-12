package org.quiz02_preparation.behavioral_patterns.visitor_pattern;

// Concrete Elements
public class Square implements IShape{

    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}
