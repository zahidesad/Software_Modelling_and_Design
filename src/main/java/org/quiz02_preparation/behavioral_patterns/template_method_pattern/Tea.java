package org.quiz02_preparation.behavioral_patterns.template_method_pattern;

public class Tea extends CaffeineBeverage{

    @Override
    protected void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding lemon");
    }
}
