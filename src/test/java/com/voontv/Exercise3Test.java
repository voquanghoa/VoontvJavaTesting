package com.voontv;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise3Test {

    @Test
    public void test_removesCharacterRedundancy () {
        Exercise3 exercise3 = new Exercise3();
        assertEquals( exercise3.removesCharacterRedundancy("abbbbbbccccd eeffffddbc"),"abcd efdbc");
    }
}
