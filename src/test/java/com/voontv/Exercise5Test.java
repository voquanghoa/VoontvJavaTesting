package com.voontv;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise5Test {

    @Test
    public void test_getMaxCommonDivisors() {
        Exercise5 exercise5 = new Exercise5();
        assertEquals(exercise5.getMaxCommonDivisors(8,24),8);
        assertEquals(exercise5.getMaxCommonDivisors(24,18),6);
    }

    @Test
    public void test_getLowestCommonMultiples() {
        Exercise5 exercise5 = new Exercise5();
        assertEquals(exercise5.getLowestCommonMultiples(8,24),24);
        assertEquals(exercise5.getLowestCommonMultiples(5,9),45);
    }
    @Test
    public void test_getMinCommonMultiplesInArray () {
        Exercise5 exercise5 = new Exercise5();
        assertEquals (exercise5.getLowestCommonMultiples(new int[] {1,9,7,3}),63);
    }
}
