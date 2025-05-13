package org.quiz02_preparation.behavioral_patterns.memento_pattern;

// Originator
public class TextEditor {
    private String state;

    public void write(String newText){
        state += newText;
    }

    public Memento createMemento(){
        return new Memento(state);
    }

    public void restore(Memento memento){
        this.state = memento.getState();
    }

    public String getState() {
        return state;
    }
}
