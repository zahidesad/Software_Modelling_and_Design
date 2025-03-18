package org.Week02Lab.SingletonExamples;

public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {
        System.out.println("Lazy Singelton instance created.");
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
