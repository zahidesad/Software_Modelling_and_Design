package org.quiz02_preparation.behavioral_patterns.command_runnable_pattern;

// Receiver class
public class Light {
    private boolean isOn;

    public void turnOn(){
        isOn = true;
        System.out.println("Light turned on");
    }

    public void turnOff(){
        isOn = false;
        System.out.println("Light turned off");
    }

    public boolean isOn(){
        return isOn;
    }
}
