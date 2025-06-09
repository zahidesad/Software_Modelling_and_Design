package org.week14_lab.example03;

public abstract class Dish {
    protected final String mainIngredient;
    protected final CookingMethod method;

    protected Dish(String mainIngredient, CookingMethod method) {
        this.mainIngredient = mainIngredient;
        this.method = method;
    }


    public String prepare() {
        return method.cook(mainIngredient);
    }
}
