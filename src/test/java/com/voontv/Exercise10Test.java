package com.voontv;

import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise10Test {

    @Test
    public void test_isLeapYear() {
        Exercise10 exercise10 = new Exercise10();
        assertTrue(exercise10.isLeapYear(2000));
        assertTrue(exercise10.isLeapYear(1464));
        assertFalse(exercise10.isLeapYear(1463));
    }

    @Test
    public void test_getDay() {
        Exercise10 exercise10 = new Exercise10();
        assertEquals(exercise10.getDay(3,1990),31);
        assertEquals(exercise10.getDay(6,1990),30);
        assertEquals(exercise10.getDay(2,2384),29);
        assertEquals(exercise10.getDay(2,2381),28);
    }

    @Test
    public void test_checkCorrectMonth() {
        Exercise10 exercise9 = new Exercise10();
        assertTrue(exercise9.checkCorrectMonth(12));
        assertTrue(exercise9.checkCorrectMonth(9));
        assertFalse(exercise9.checkCorrectMonth(87));
    }

    @Test
    public void test_checkCorrectYear() {
        Exercise10 exercise10 = new Exercise10();
        assertFalse(exercise10.checkCorrectYear(12));
        assertTrue(exercise10.checkCorrectYear(1998));
        assertFalse(exercise10.checkCorrectYear(87));
    }

    @Test
    public void test_countDayRemainning() {
        Exercise10 exercise10 = new Exercise10();
        assertEquals(exercise10.countDayRemainning(10,1990),92);
        assertEquals(exercise10.countDayRemainning(12,1990),31);
    }

    @Test
    public void test_getDayRemainingInYear() {
        Exercise10 exercise10 = new Exercise10();
        assertEquals(exercise10.getDayRemainingInYear(10,10,1990),82);
    }

    @Test (expected = RuntimeException.class)
    public void test_getDayRemainingInYear_Exception() throws RuntimeException {
        Exercise10 exercise10 = new Exercise10();
        assertEquals(exercise10.getDayRemainingInYear(10,36,1990),51);
    }
}
