package com.voontv;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Exercise4Test {

    @Test
    public void test_totalChildArrayMaxInArray () {
        Exercise4 exercise4 = new Exercise4();
        assertEquals(exercise4.totalChildArrayMaxInArray(new int[] {0, 1, -2, 8, 9, 0, 1, -2, 1, 1, 3, 1, 1}),18);
    }
}
