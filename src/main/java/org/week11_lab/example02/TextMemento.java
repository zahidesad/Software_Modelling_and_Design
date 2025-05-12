package org.week11_lab.example02;

public class TextMemento implements Memento{
    private final String state;

    public TextMemento(String state) {
        this.state = state;
    }

    @Override
    public void restore(TextEditor editor) {
        editor.setText(state);

    }
}
