package com.voontv;

import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise11Test {

    @Test
    public void test_isLeapYear() {
        Exercise11 exercise11 = new Exercise11();
        assertTrue(exercise11.isLeapYear(2000));
        assertTrue(exercise11.isLeapYear(1464));
        assertFalse(exercise11.isLeapYear(1463));
    }

    @Test
    public void test_getDay() {
        Exercise11 exercise11 = new Exercise11();
        assertEquals(exercise11.getDay(3,1990),31);
        assertEquals(exercise11.getDay(6,1990),30);
        assertEquals(exercise11.getDay(2,2384),29);
        assertEquals(exercise11.getDay(2,2381),28);
    }

    @Test
    public void test_checkCorrectMonth() {
        Exercise11 exercise11 = new Exercise11();
        assertTrue(exercise11.checkCorrectMonth(12));
        assertTrue(exercise11.checkCorrectMonth(9));
        assertFalse(exercise11.checkCorrectMonth(87));
    }

    @Test
    public void test_checkCorrectYear() {
        Exercise11 exercise11 = new Exercise11();
        assertFalse(exercise11.checkCorrectYear(12));
        assertTrue(exercise11.checkCorrectYear(1998));
        assertFalse(exercise11.checkCorrectYear(87));
    }

    @Test
    public void test_countDayRemainning() {
        Exercise11 exercise11 = new Exercise11();
        assertEquals(exercise11.countDayRemainning(10,1990),92);
        assertEquals(exercise11.countDayRemainning(12,1990),31);
    }

    @Test
    public void test_getDayRemainingInYear() {
        Exercise11 exercise11 = new Exercise11();
        assertEquals(exercise11.getDayRemainingInYear(10,10,1990),82);
    }

    @Test
    public void test_checkCorrectDay() {
        Exercise11 exercise11 = new Exercise11();
        assertTrue(exercise11.checkCorrectDay(26));
        assertTrue(exercise11.checkCorrectDay(1));
        assertFalse(exercise11.checkCorrectDay(43));
    }

    @Test (expected = RuntimeException.class)
    public void test_getDayRemainingInYear_Exception() {
        Exercise11 exercise11 = new Exercise11();
        exercise11.getDayRemainingInYear(10,36,1990);
    }

    @Test
    public void test_getDayFromStartYear() {
        Exercise11 exercise11 = new Exercise11();
        assertEquals(exercise11.getDayFromStartYear(10,10,1990),283);
    }

    @Test (expected = RuntimeException.class)
    public void test_getDayFromStartYearWithRuntimeException() {
        Exercise11 exercise11 = new Exercise11();
        exercise11.getDayFromStartYear(10,18,1990);
    }

    @Test
    public void test_getDateInWeek() {
        Exercise11 exercise11 = new Exercise11();
        assertEquals(exercise11.getDateInWeek(5,4,2019),"Thu 6");
        assertEquals(exercise11.getDateInWeek(19,11,2016),"Thu 7");
        assertEquals(exercise11.getDateInWeek(16,9,2019),"Thu 2");
        assertEquals(exercise11.getDateInWeek(20,10,2020),"Thu 3");
        assertEquals(exercise11.getDateInWeek(21,11,2019),"Thu 5");
        assertEquals(exercise11.getDateInWeek(28,7,2019),"Chu nhat");
        assertEquals(exercise11.getDateInWeek(4,9,2019),"Thu 4");
    }

    @Test (expected =  RuntimeException.class)
    public void test_geDateInWeekRuntimeExeption() {
        Exercise11 exercise11 = new Exercise11();
        exercise11.getDateInWeek(5,4,30000);
    }
}
