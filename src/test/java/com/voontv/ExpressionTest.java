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


}
