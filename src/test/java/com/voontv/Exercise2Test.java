package com.voontv;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise2Test {

    @Test
    public void test_getValueFiboInPosition () {
        Exercise2 exercise2 = new Exercise2();
        assertEquals (exercise2.getValueFiboInPosition(4),3);
        assertEquals (exercise2.getValueFiboInPosition(5),5);
        assertEquals (exercise2.getValueFiboInPosition(6),8);
    }

    @Test
    public void test_totalFiboInRangeLimit () {
        Exercise2 exercise2 = new Exercise2();
        assertEquals(exercise2.totalFiboInRangeLimit(5),12);
        assertEquals(exercise2.totalFiboInRangeLimit(8),54);
    }
}
