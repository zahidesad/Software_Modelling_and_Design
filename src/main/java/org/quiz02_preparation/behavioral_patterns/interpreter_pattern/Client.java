package org.quiz02_preparation.behavioral_patterns.interpreter_pattern;

public class Client {
    public static void main(String[] args) {
        Expression isMarriedWoman = getMarriedExpression();
        System.out.println("Julie Is Married Woman: " + isMarriedWoman.interpret("Julie Married"));
    }

    public static Expression getMarriedExpression() {
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }
}
