package org.midterm_preparation.behavioral_patterns.interpreter_pattern;

public class PlusExpression implements Expression{
    private Expression left;
    private Expression right;

    public PlusExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }


    @Override
    public int interpret() {
        return left.interpret() + right.interpret();
    }
}
