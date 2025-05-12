package org.quiz02_preparation.behavioral_patterns.command_pattern;

public class Client {
    public static void main(String[] args) {
        // Receiver - light object
        Light livingRoomLight = new Light();

        // Concrete Command objects
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);

        // Invoker - remote control
        RemoteControl remote = new RemoteControl();

        remote.setCommand(lightOn);
        remote.pressButton();

        remote.setCommand(lightOff);
        remote.pressButton();

    }
}
