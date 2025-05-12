package org.quiz02_preparation.behavioral_patterns.strategy_pattern;

public class SortingContext {
    private SortingStrategy sortingStrategy;

    public SortingContext(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void setSortingStrategy(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void performSorting(int [] array) {
        sortingStrategy.sort(array);
    }
}
