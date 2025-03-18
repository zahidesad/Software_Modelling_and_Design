package org.Week02Lab.SingletonExamples;

public class EagerSingelton {
    private static EagerSingelton instance = new EagerSingelton();

    private EagerSingelton() {
        System.out.println("Eager Singelton instance created.");
    }

    public static EagerSingelton getInstance() {
        return instance;
    }
}
