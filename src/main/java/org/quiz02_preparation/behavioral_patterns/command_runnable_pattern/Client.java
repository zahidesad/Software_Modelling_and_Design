package org.quiz02_preparation.behavioral_patterns.command_runnable_pattern;

public class Client {
    public static void main(String[] args) {
        // Receiver - light object
        Light livingRoomLight = new Light();

        // Invoker - remote control
        RemoteControl remote = new RemoteControl();

        remote.setCommand(livingRoomLight::turnOn);
        remote.pressButton();

        remote.setCommand(livingRoomLight::turnOff);
        remote.pressButton();

    }
}
