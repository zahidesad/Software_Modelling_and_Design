package org.quiz01_preparation.creational_patterns.singleton.lazy_initialization;

public class Main {
    public static void main(String[] args) {
        LazySingleton singleton1 = LazySingleton.getInstance();
        LazySingleton singleton2 = LazySingleton.getInstance();

        System.out.println(singleton1 == singleton2);  // true
    }
}
