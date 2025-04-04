package org.week02_lab.singleton_examples;

public class EagerSingelton {
    private static EagerSingelton instance = new EagerSingelton();

    private EagerSingelton() {
        System.out.println("Eager Singelton instance created.");
    }

    public static EagerSingelton getInstance() {
        return instance;
    }
}
