package org.quiz01_preparation.creational_patterns.singleton.eager_initialization;

public class Main {
    public static void main(String[] args) {
        EagerSingleton singleton1 = EagerSingleton.getInstance();
        EagerSingleton singleton2 = EagerSingleton.getInstance();

        System.out.println(singleton1 == singleton2);  // true
    }
}
