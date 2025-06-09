package org.final_prep.qs4;

public abstract class Dish {
    public CookingMethod cookingMethod;

    public Dish(CookingMethod cookingMethod) {
        this.cookingMethod = cookingMethod;
    }

    public void getCooked(){
        cookingMethod.cook();
    }
}
