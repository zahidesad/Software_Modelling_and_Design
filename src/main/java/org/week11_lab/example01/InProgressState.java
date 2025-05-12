package org.week11_lab.example01;

public class InProgressState implements State {
    @Override
    public void claim(Task task) {
        throw new IllegalStateException("Task is already in progress.");
    }

    @Override
    public void reject(Task task) {
        task.setState(new PendingState());
    }

    @Override
    public void complete(Task task) {
        task.setState(new CompletedState());
    }

    @Override
    public void pause(Task task) {
        task.setState(new PendingState());
    }

    @Override
    public String getStatus() {
        return "In Progress";
    }
}

