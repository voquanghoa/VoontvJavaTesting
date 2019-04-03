package com.voontv;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise1Test {

    @Test
    public void test_isCheckFirstRulesWithUsername () {
        Exercise1 expression = new Exercise1();
        assertEquals(expression.isCheckFirstRulesWithUsername("maimaimottinhyeu"),true);
        assertEquals(expression.isCheckFirstRulesWithUsername("maimaimottinhyeu_"),true);
        assertEquals(expression.isCheckFirstRulesWithUsername("maimaimottinhyeu?"),false);
    }

    @Test
    public void test_isCheckSecondRulesWithUsername () {
        Exercise1 expression = new Exercise1();
        assertEquals(expression.isCheckSecondRulesWithUsername("maimaimottinhyeu--"),false);
        assertEquals(expression.isCheckSecondRulesWithUsername("maimaimot.-tinhyeu_"),false);
        assertEquals(expression.isCheckSecondRulesWithUsername("maimaimo._-ttinhyeu?"),true);
    }
}
