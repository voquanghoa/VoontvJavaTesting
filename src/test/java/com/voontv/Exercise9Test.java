package com.voontv;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class Exercise9Test {

    @Test
    public void test_isLeapYear() {
        Exercise9 exercise9 = new Exercise9();
        assertTrue(exercise9.isLeapYear(2000));
        assertTrue(exercise9.isLeapYear(1464));
        assertFalse(exercise9.isLeapYear(1463));
    }

    @Test
    public void test_getDay() {
        Exercise9 exercise9 = new Exercise9();
        assertEquals(exercise9.getDay(3,1990),31);
        assertEquals(exercise9.getDay(6,1990),30);
        assertEquals(exercise9.getDay(2,2384),29);
        assertEquals(exercise9.getDay(2,2381),28);
    }

    @Test
    public void test_checkCorrectMonth() {
        Exercise9 exercise9 = new Exercise9();
        assertTrue(exercise9.checkCorrectMonth(12));
        assertTrue(exercise9.checkCorrectMonth(9));
        assertFalse(exercise9.checkCorrectMonth(87));
    }

    @Test
    public void test_checkCorrectYear() {
        Exercise9 exercise9 = new Exercise9();
        assertFalse(exercise9.checkCorrectYear(12));
        assertTrue(exercise9.checkCorrectYear(1998));
        assertFalse(exercise9.checkCorrectYear(87));
    }

    @Test
    public void test_getDayRemainingInMonth() {
        Exercise9 exercise9 = new Exercise9();
        assertEquals(exercise9.getDayRemainingInMonth(23,11,1998),7);
    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void test_test_getDayRemainingInMonthWithExpectedException() throws RuntimeException {
        expectedException.expect(RuntimeException.class);
        expectedException.expectMessage("Invalid date");
        Exercise9 exercise9 = new Exercise9();
        assertEquals(exercise9.getDayRemainingInMonth(23,11,4000),7);
    }
}
