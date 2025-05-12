package org.quiz02_preparation.behavioral_patterns.observer_pattern;

public class PhoneDisplay implements Observer {
    private String weather;

    @Override
    public void update(String weather) {
        this.weather = weather;
        System.out.println("Phone Display: Weather updated - " + weather);
    }
}
