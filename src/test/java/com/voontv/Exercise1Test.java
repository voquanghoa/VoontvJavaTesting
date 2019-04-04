package com.voontv;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise1Test {

    @Test
    public void test_checkFirstRulesWithUsername () {
        Exercise1 expression = new Exercise1();
        assertEquals(expression.checkFirstRulesWithUsername("maimaimottinhyeu"),true);
        assertEquals(expression.checkFirstRulesWithUsername("maimaimottinhyeu_"),true);
        assertEquals(expression.checkFirstRulesWithUsername("maimaimottinhyeu?"),false);
    }

    @Test
    public void test_checkSecondRulesWithUsername () {
        Exercise1 expression = new Exercise1();
        assertEquals(expression.checkSecondRulesWithUsername("maimaimottinhyeu--"),false);
        assertEquals(expression.checkSecondRulesWithUsername("maimaimot.-tinhyeu_"),false);
        assertEquals(expression.checkSecondRulesWithUsername("maimaimo._-ttinhyeu?"),true);
    }

    @Test
    public void test_checkFistAndLastCharacter () {
        Exercise1 exercise1 = new Exercise1 ();
        assertEquals (exercise1.checkFistAndLastCharacter("Toi_la_toi"),false);
        assertEquals (exercise1.checkFistAndLastCharacter("toi_la_toi"),true);
        assertEquals (exercise1.checkFistAndLastCharacter("Toi_la_toI"),false);
    }

    @Test
    public void test_checkFirstRulesWithDomain () {
        Exercise1 exercise1 = new Exercise1();
        assertEquals (exercise1.checkFirstRulesWithDomain (".com"),true);
        assertEquals (exercise1.checkFirstRulesWithDomain ("._com"),true);
        assertEquals (exercise1.checkFirstRulesWithDomain("-dot.com"),false);
    }

    @Test
    public void test_countDotsInDomain () {
        Exercise1 exercise1 = new Exercise1();
        assertEquals (exercise1.countDotsInDomain("...domain.com"),false);
        assertEquals (exercise1.countDotsInDomain("..domain.com"),true);
    }

    @Test
    public void test_checkRulesPositionsDots () {
        Exercise1 exercise1 = new Exercise1();
        assertEquals(exercise1.checkRulesPositionsDots(".domain.com"),false);
        assertEquals(exercise1.checkRulesPositionsDots("domain.com."),false);
        assertEquals(exercise1.checkRulesPositionsDots("domain..com"),false);
        assertEquals(exercise1.checkRulesPositionsDots("dom.ain.com"),true);
    }
}
