package org.quiz01_preparation.creational_patterns.singleton.lazy_initialization;

public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {
        System.out.println("Lazy Singleton instance created!");
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
