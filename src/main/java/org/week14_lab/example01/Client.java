package org.week14_lab.example01;

public class Client {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        Observer phoneDisplay = new PhoneDisplay();
        Observer tvDisplay = new WindowsDisplay();

        weatherStation.registerObserver(phoneDisplay);
        weatherStation.registerObserver(tvDisplay);

        weatherStation.setWeather("sunny");
    }
}
