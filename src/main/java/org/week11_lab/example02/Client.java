package org.week11_lab.example02;

public class Client {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        System.out.println("Initial: \"" + editor.getText() + "\"");

        editor.write("Hello");
        System.out.println("After write: \"" + editor.getText() + "\"");

        editor.write(", world!");
        System.out.println("After write: \"" + editor.getText() + "\"");

        System.out.println("\nUndo once…");
        editor.undo();
        System.out.println("State: \"" + editor.getText() + "\"");

        System.out.println("\nUndo twice…");
        editor.undo();
        System.out.println("State: \"" + editor.getText() + "\"");

        System.out.println("\nUndo a third time (no state left)...");
        editor.undo();  // NullMemento → no change
        System.out.println("State: \"" + editor.getText() + "\"");
    }
}
