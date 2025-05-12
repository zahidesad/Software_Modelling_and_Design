package org.quiz02_preparation.behavioral_patterns.visitor_pattern;

// Visitor interface
public interface ShapeVisitor {
    public void visit(Circle circle);
    public void visit(Square rectangle);
    public void visit(Triangle triangle);
}
