package org.week11_lab.example01;


public class RejectedState implements State {
    @Override
    public void claim(Task task) {
        throw new IllegalStateException("Cannot claim a task that has been rejected.");
    }

    @Override
    public void reject(Task task) {
        throw new IllegalStateException("Task is already rejected.");
    }

    @Override
    public void complete(Task task) {
        throw new IllegalStateException("Cannot complete a rejected task.");
    }

    @Override
    public void pause(Task task) {
        throw new IllegalStateException("Cannot pause a rejected task.");
    }

    @Override
    public String getStatus() {
        return "Rejected";
    }
}

