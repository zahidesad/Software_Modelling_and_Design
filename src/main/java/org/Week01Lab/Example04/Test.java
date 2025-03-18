package org.Week01Lab.Example04;

public class Test {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 10, 12, 15, 20, 25};

        // Applying EvenFilter
        System.out.println("Even Numbers: " + MyArray.filter(numbers, new EvenFilter()));

        // Applying GreaterThanTenFilter
        System.out.println("Numbers Greater Than 10: " + MyArray.filter(numbers, new GreaterThanTenFilter()));
    }
}
