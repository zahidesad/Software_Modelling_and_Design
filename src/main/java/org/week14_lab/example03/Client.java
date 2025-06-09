package org.week14_lab.example03;

public class Client {
    public static void main(String[] args) {
        Dish steak = new MeatDish("Steak", new GrillMethod());
        Dish chicken = new MeatDish("Chicken", new FryMethod());

        System.out.println("1. " + steak.prepare());
        System.out.println("2. " + chicken.prepare());
    }
}
