package org.quiz02_preparation.behavioral_patterns.command_pattern;

public class LightOnCommand  implements Command{
    private Light light; // "Receiver" that apply Command

    public LightOnCommand(Light light) {
        this.light = light;
    }


    @Override
    public void execute() {
        light.turnOn();
    }
}
