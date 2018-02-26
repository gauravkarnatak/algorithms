package com.practice.algorithms.stack;

import java.util.Stack;

/**
 * @author gaurav_karnatak Created: 2/26/18
 */
public class Expression {

    private static final String SUM = "+";
    private static final String SUBTRACT = "-";
    private static final String MULTIPLY = "*";
    private static final String DIVIDE = "/";

    public int evaluate(final String expression) {
        String[] tokens = expression.split("\\s+");

        Stack<Integer> operands = new Stack<>();
        Stack<String> operators = new Stack<>();

        for (String token : tokens) {
            if (token.equals("(")) {
                //ignore
            }
            else if (token.equals(SUM) || token.equals(SUBTRACT) || token.equals(MULTIPLY) || token.equals(DIVIDE)) {
                operators.push(token);
            }
            else if (token.equals(")")) {
                operation(operands, operators);
            }
            else {
                operands.push(Integer.valueOf(token));
            }
        }
        return operands.pop();
    }

    private static void operation(final Stack<Integer> operands, final Stack<String> operators) {
        int val = operands.pop();
        String operator = operators.pop();
        if (SUM.equals(operator)) {
            operands.push(operands.pop() + val);
        }
        else if (SUBTRACT.equals(operator)) {
            operands.push(operands.pop() - val);
        }
        else if (MULTIPLY.equals(operator)) {
            operands.push(val * operands.pop());
        }
        else if (DIVIDE.equals(operator)) {
            operands.push(operands.pop() / val);
        }
    }
}
