package com.practice.algorithms.stack;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * @author gaurav_karnatak Created: 2/26/18
 */
public class ExpressionTest {

    private static final Expression EXPRESSION = new Expression();

    @Test
    public void add() {
        assertEquals(5, EXPRESSION.evaluate("( 3 + 2 )"));
    }

    @Test
    public void subtract() {
        assertEquals(1, EXPRESSION.evaluate("( 3 - 2 )"));
    }

    @Test
    public void multiply() {
        assertEquals(6, EXPRESSION.evaluate("( 3 * 2 )"));
    }

    @Test
    public void divide() {
        assertEquals(3, EXPRESSION.evaluate("( 6 / 2 )"));
    }
}
