package com.voontv;

import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise6Test {

    @Test
    public void getLargestCommonDivisor_Int() {
        Exercise6 exercise6 = new Exercise6();
        assertEquals(exercise6.getLargestCommonDivisor(64,37),1);
        assertEquals(exercise6.getLargestCommonDivisor(65,25),5);
    }

    @Test
    public void test_getLowestCommonMultiples() {
        Exercise6 exercise6 = new Exercise6();
        assertEquals(exercise6.getLowestCommonMultiples(21,7),21);
        assertEquals(exercise6.getLowestCommonMultiples(14,8),56);
    }

    @Test
    public  void test_getLargestCommonDivisor_Array() {
        Exercise6 exercise6 = new Exercise6();
        assertEquals(exercise6.getLargestCommonDivisor(new int[]{6,36,9,15}),3);

    }
}
