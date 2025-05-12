package org.quiz02_preparation.behavioral_patterns.strategy_pattern;

public class Client {
    public static void main(String[] args) {
        SortingContext sortingContext1 = new SortingContext(new BubbleSortStrategy());
        int[] array1 = {5, 2, 9, 1, 5};
        sortingContext1.performSorting(array1);

        SortingContext sortingContext2 = new SortingContext(new MergeSortStrategy());
        int[] array2 = {8, 3, 7, 4, 2};
        sortingContext2.performSorting(array2);

        SortingContext sortingContext3 = new SortingContext(new QuickSortStrategy());
        int[] array3 = {8, 3, 7, 4, 2};
        sortingContext3.performSorting(array3);
    }
}
