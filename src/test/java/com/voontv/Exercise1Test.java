package com.voontv;

import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise1Test {

    @Test
    public void test_checkFirstRulesWithUsername () {
        Exercise1 expression = new Exercise1();
        assertTrue(expression.checkFirstRulesWithUsername("maimaimottinhyeu"));
        assertTrue(expression.checkFirstRulesWithUsername("maimaimottinhyeu_"));
        assertFalse(expression.checkFirstRulesWithUsername("maimaimottinhyeu?"));
    }

    @Test
    public void test_checkSecondRulesWithUsername () {
        Exercise1 expression = new Exercise1();
        assertFalse(expression.checkSecondRulesWithUsername("maimaimottinhyeu--"));
        assertFalse(expression.checkSecondRulesWithUsername("maimaimot.-tinhyeu_"));
        assertTrue(expression.checkSecondRulesWithUsername("maimaimo._-ttinhyeu?"));
    }

    @Test
    public void test_checkFistAndLastCharacter () {
        Exercise1 exercise1 = new Exercise1 ();
        assertFalse(exercise1.checkFistAndLastCharacter("?Toi_la_toi"));
        assertTrue(exercise1.checkFistAndLastCharacter("toi_la_toi"));
        assertFalse(exercise1.checkFistAndLastCharacter("Toi_la_toI-"));
    }

    @Test
    public void test_checkFirstRulesWithDomain () {
        Exercise1 exercise1 = new Exercise1();
        assertTrue(exercise1.checkFirstRulesWithDomain(".com"));
        assertTrue(exercise1.checkFirstRulesWithDomain("._com"));
        assertFalse(exercise1.checkFirstRulesWithDomain("-dot.com"));
    }

    @Test
    public void test_countDotsInDomain () {
        Exercise1 exercise1 = new Exercise1();
        assertFalse(exercise1.countDotsInDomain("...domain.com"));
        assertTrue(exercise1.countDotsInDomain("..domain.com"));
    }

    @Test
    public void test_checkRulesPositionsDots () {
        Exercise1 exercise1 = new Exercise1();
        assertFalse(exercise1.checkRulesPositionsDots(".domain.com"));
        assertFalse(exercise1.checkRulesPositionsDots("domain.com."));
        assertFalse(exercise1.checkRulesPositionsDots("domain..com"));
        assertTrue(exercise1.checkRulesPositionsDots("dom.ain.com"));
    }
}
