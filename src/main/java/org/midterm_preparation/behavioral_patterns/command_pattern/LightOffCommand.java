package org.midterm_preparation.behavioral_patterns.command_pattern;

public class LightOffCommand implements Command{
    private Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }


    @Override
    public void execute() {
        light.turnOff();
    }
}
