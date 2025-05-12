package org.quiz02_preparation.behavioral_patterns.iterator_pattern;

public class ConcreteIterator<T> implements Iterator<T> {
    private final ConcreteAggregate<T> aggregate;
    private int current = 0;

    public ConcreteIterator(ConcreteAggregate<T> aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public boolean hasNext() {
        return current < aggregate.size();
    }

    @Override
    public T next() {
        T item = aggregate.getItem(current);
        current++;
        return item;
    }
}
