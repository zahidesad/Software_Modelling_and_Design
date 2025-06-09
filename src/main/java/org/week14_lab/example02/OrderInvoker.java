package org.week14_lab.example02;

public class OrderInvoker {
    private OrderCommand command;
    public void setCommand(OrderCommand command) {
        this.command = command;
    }
    public void invoke() {
        if (command != null) {
            command.execute();
        }
    }
}

