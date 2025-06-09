package org.week14_lab.example03;

public class FryMethod implements CookingMethod {
    @Override
    public String cook(String ingredient) {
        return "Fried " + ingredient;
    }
}
