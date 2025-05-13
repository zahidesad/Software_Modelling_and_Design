package org.quiz02_preparation.behavioral_patterns.memento_pattern;

// Originator
public class TextEditor {
    private String text = "";

    public void write(String newText){
        text += newText;
    }

    public Memento takeSnapshot(){
        return new Memento(text);
    }

    public void restore(Memento memento){
        this.text = memento.getState();
    }

    public String read() {
        return text;
    }
}
