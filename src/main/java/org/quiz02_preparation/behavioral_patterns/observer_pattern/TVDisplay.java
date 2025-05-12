package org.quiz02_preparation.behavioral_patterns.observer_pattern;

public class TVDisplay implements Observer {
    String weather;

    @Override
    public void update(String weather) {
        this.weather = weather;
        System.out.println("TV Display: Weather updated - " + weather);
    }
}
