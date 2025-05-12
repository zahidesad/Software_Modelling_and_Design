package org.week11_lab.example01;


public class PendingState implements State {
    @Override
    public void claim(Task task) {
        task.setState(new InProgressState());
    }

    @Override
    public void reject(Task task) {
        task.setState(new RejectedState());
    }

    @Override
    public void complete(Task task) {
        throw new IllegalStateException("Cannot complete a task that's still pending.");
    }

    @Override
    public void pause(Task task) {
        throw new IllegalStateException("Cannot pause a task that's still pending.");
    }

    @Override
    public String getStatus() {
        return "Pending";
    }
}

