package com.voontv;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise8Test {

    @Test
    public void test_totalDigitReverse() {
        Exercise8 exercise8 = new Exercise8();
        assertEquals(exercise8.totalDigitReverse(new int[] {125,234,7,190}),1051);
    }
    @Test
    public void test_getDigitReverse() {
        Exercise8 exercise8 = new Exercise8();
        assertEquals(exercise8.getDigitReverse(143),341);
        assertEquals(exercise8.getDigitReverse(4),4);
        assertEquals(exercise8.getDigitReverse(140),41);
    }
}
