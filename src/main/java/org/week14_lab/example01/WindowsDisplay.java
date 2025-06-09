package org.week14_lab.example01;

public class WindowsDisplay implements Observer {
    String weather;

    @Override
    public void update(String weather) {
        this.weather = weather;
        System.out.println("TV Display: Weather updated - " + weather);
    }
}
