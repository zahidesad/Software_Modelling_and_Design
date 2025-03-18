package org.Week02Lab.SingletonExamples;

public class Main {
    public static void main(String[] args) {
        EagerSingelton eagerSingelton1 = EagerSingelton.getInstance();
        EagerSingelton eagerSingelton2 = EagerSingelton.getInstance();

        System.out.println(eagerSingelton1 == eagerSingelton2);

        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        LazySingleton lazySingleton2 = LazySingleton.getInstance();

        System.out.println(lazySingleton1 == lazySingleton2);
    }
}
