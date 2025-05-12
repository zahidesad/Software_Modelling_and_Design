package org.quiz02_preparation.behavioral_patterns.iterator_pattern;

public interface Iterator<T> {
    boolean hasNext();
    T next();
}