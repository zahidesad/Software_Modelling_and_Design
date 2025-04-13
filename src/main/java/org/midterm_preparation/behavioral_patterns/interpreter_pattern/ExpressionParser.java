package org.midterm_preparation.behavioral_patterns.interpreter_pattern;

import java.util.Stack;

public class ExpressionParser {
    public static Expression parse(String expression) {
        Stack<Expression> stack = new Stack<>();

        String[] tokens = expression.split(" ");
        for (String token : tokens) {
            switch (token) {
                case "+":

                    Expression rightPlus = stack.pop();
                    Expression leftPlus = stack.pop();
                    Expression plusExpr = new PlusExpression(leftPlus, rightPlus);
                    stack.push(plusExpr);
                    break;
                case "-":
                    Expression rightMinus = stack.pop();
                    Expression leftMinus = stack.pop();
                    Expression minusExpr = new MinusExpression(leftMinus, rightMinus);
                    stack.push(minusExpr);
                    break;
                default:
                    int number = Integer.parseInt(token);
                    stack.push(new NumberExpression(number));
                    break;
            }
        }
        return stack.pop();
    }
}
