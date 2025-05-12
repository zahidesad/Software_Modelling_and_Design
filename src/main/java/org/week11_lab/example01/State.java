package org.week11_lab.example01;

public interface State {
    void claim(Task task);
    void reject(Task task);
    void complete(Task task);
    void pause(Task task);
    String getStatus();
}

