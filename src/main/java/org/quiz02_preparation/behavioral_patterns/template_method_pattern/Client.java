package org.quiz02_preparation.behavioral_patterns.template_method_pattern;

public class Client {
    public static void main(String[] args) {
        System.out.println("Making tea:");
        CaffeineBeverage tea = new Tea();
        tea.makeBeverage();

        System.out.println("\nMaking coffee:");
        CaffeineBeverage  coffee = new Coffee();
        coffee.makeBeverage();
    }
}
