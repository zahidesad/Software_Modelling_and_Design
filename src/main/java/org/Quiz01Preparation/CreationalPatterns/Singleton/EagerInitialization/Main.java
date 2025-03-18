package org.Quiz01Preparation.CreationalPatterns.Singleton.EagerInitialization;

public class Main {
    public static void main(String[] args) {
        EagerSingleton singleton1 = EagerSingleton.getInstance();
        EagerSingleton singleton2 = EagerSingleton.getInstance();

        System.out.println(singleton1 == singleton2);  // true
    }
}
