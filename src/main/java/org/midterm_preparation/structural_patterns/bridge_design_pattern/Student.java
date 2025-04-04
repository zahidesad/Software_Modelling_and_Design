package org.midterm_preparation.structural_patterns.bridge_design_pattern;

public abstract class Student{
    StudentAction action;

    public Student(StudentAction action) {
        this.action = action;
    }

    void sayMySituation(){
        action.action();
    }
}
