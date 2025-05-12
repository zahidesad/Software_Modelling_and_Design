package org.quiz02_preparation.behavioral_patterns.observer_pattern;


public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
