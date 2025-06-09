package org.week14_lab.example01;

public class PhoneDisplay implements Observer {
    private String weather;

    @Override
    public void update(String weather) {
        this.weather = weather;
        System.out.println("Phone Display: Weather updated - " + weather);
    }
}
