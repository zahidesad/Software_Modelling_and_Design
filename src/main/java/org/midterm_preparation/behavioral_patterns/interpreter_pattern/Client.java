package org.midterm_preparation.behavioral_patterns.interpreter_pattern;

public class Client {
    public static void main(String[] args) {
        String inputExpr = "3 5 + 2 -";
        Expression parsedExpression = ExpressionParser.parse(inputExpr);

        int result = parsedExpression.interpret();
        System.out.println("Result of '" + inputExpr + "' is: " + result);
    }
}
