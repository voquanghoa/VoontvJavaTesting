package com.voontv;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExpressionTest {

    @Test
    public void test_add(){
        Expression expression = new Expression();
        assertEquals(expression.add(1, 2), 3);
    }

    @Test
    public void test_subtract(){
        Expression expression = new Expression();
        assertEquals(expression.subtract(4, 2), 2);
    }

    @Test
    public void test_divide() {
        Expression expression = new Expression();
        assertEquals(expression.divide(4, 2), 2);
    }

    @Test
    public void test_max(){
        Expression expression = new Expression();

        assertEquals(expression.max(1, 2, 3), 3);
        assertEquals(expression.max(1, 8, 3), 8);
        assertEquals(expression.max(9, 2, 3), 9);
    }
}
