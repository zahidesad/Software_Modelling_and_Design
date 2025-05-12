package org.quiz02_preparation.behavioral_patterns.visitor_pattern;

// Element Interface
public interface IShape {
    void accept(ShapeVisitor visitor);
}
