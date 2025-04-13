package org.midterm_preparation.behavioral_patterns.command_pattern;

// Invoker
public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton(){
        if(command != null){
            command.execute();
        }else {
            System.out.println("Command not received yet");
        }
    }
}
