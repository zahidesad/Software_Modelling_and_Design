package org.Quiz01Preparation.CreationalPatterns.Singleton.EagerInitialization;

public class EagerSingleton {
    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton(){
        System.out.println("Eager Singleton instance created!");
    }

    public static EagerSingleton getInstance(){
        return instance;
    }
}
