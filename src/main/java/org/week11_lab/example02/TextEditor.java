package org.week11_lab.example02;

public class TextEditor {
    private String text = "";
    private final EditorHistory history = new EditorHistory();

    public void write(String moreText) {
        history.push(new TextMemento(text));
        text += moreText;
    }

    public void undo() {
        Memento m = history.pop();
        m.restore(this);
    }


    protected void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}

