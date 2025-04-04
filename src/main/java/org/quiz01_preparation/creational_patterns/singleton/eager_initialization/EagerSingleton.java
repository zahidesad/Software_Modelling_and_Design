package org.quiz01_preparation.creational_patterns.singleton.eager_initialization;

public class EagerSingleton {
    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton(){
        System.out.println("Eager Singleton instance created!");
    }

    public static EagerSingleton getInstance(){
        return instance;
    }
}
