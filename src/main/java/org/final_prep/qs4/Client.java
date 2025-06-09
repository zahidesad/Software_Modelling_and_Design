package org.final_prep.qs4;

public class Client {
    public static void main(String[] args) {
        Dish grilledSteak = new Steak(new GrilledMethod());
        grilledSteak.getCooked();


    }
}
