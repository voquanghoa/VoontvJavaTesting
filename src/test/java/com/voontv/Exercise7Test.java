package com.voontv;

import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise7Test {

    @Test
    public void test_checkCharacterSameAs() {
        Exercise7 exercise7 = new Exercise7();
        assertFalse(exercise7.checkCharacterSameAs("Toi la toi", "Tlaoitoi"));
        assertTrue(exercise7.checkCharacterSameAs("Toi la toi", "Tla oit oi"));
        assertFalse(exercise7.checkCharacterSameAs("Toi la toi", "Toi aa toi"));
    }
}
