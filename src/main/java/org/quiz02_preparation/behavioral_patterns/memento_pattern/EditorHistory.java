package org.quiz02_preparation.behavioral_patterns.memento_pattern;

import java.util.Stack;

public class EditorHistory {
    private final Stack<Memento> history = new Stack<>();

    public void save(TextEditor editor) {
        history.push(editor.takeSnapshot());
    }

    public void undo(TextEditor editor) {
        if (!history.isEmpty()){
            Memento m = history.pop();
            editor.restore(m);
        }
    }
}
