package org.quiz02_preparation.behavioral_patterns.template_method_pattern;

public class Coffee extends CaffeineBeverage{

    @Override
    protected void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}
