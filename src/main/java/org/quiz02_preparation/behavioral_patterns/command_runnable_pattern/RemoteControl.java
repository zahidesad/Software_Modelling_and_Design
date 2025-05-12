package org.quiz02_preparation.behavioral_patterns.command_runnable_pattern;

// Invoker
public class RemoteControl {
    private Runnable command;

    public void setCommand(Runnable command) {
        this.command = command;
    }

    public void pressButton(){
        if(command != null){
            command.run();
        }else {
            System.out.println("Command not received yet");
        }
    }
}
