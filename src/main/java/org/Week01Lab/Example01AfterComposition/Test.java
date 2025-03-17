package org.Week01Lab.Example01AfterComposition;

public class Test {
    public static void main(String[] args) {
        Car c = new Car(new SetColorBlue());
        c.displayColor();
        Bike b = new Bike(new SetColorRed());
        b.displayColor();
        Car c1 = new Car(() -> {
            System.out.println("My color is yellow");
        });
        c1.displayColor();
    }
}
