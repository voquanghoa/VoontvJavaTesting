package com.voontv;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise5Test {

    @Test
    public void test_getMinCommonMultiplesInArray () {
        Exercise5 exercise5 = new Exercise5();
        assertEquals (exercise5.getMinCommonMultiplesInArray(new int[] {1,5,7,3}),105);
    }
}
