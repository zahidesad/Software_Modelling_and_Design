package org.week14_lab.example03;

public class GrillMethod implements CookingMethod {
    @Override
    public String cook(String ingredient) {
        return "Grilled " + ingredient;
    }
}
