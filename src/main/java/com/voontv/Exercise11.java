package com.voontv;

public class Exercise11 {

    public boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    public int getDay(int month, int year) {
        switch(month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;

            case 2:
                if(isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }

            default:
                return 30;
        }
    }

    public boolean checkCorrectDay(int day) {
        return (day>=1 && day <=31);
    }

    public boolean checkCorrectMonth(int month){
        return (month >= 1 && month <=12);
    }

    public boolean checkCorrectYear(int year){
        return (year >= 1990 && year <=3000);
    }

    public int getDayRemainingInYear(int day, int month, int year){
        if(!checkCorrectYear(year) || !checkCorrectMonth(month) || !checkCorrectDay(day)) {
            throw new RuntimeException("Invalid date");
        } else {
            return countDayRemainning(month, year) - day;
        }
    }

    public int getDayFromStartYear(int day, int month, int year){
        if(!checkCorrectYear(year) || !checkCorrectMonth(month) || !checkCorrectDay(day)) {
            throw new RuntimeException("Invalid date");
        } else {
            return countDayRemainning(1,year) - countDayRemainning(month, year) + day;
        }
    }

    public int countDayRemainning(int month, int year) {
        int countDay = 0;
        for(int i = 12; i >= month; i--) {
            countDay += getDay(i, year);
        }
        return countDay;
    }

    public String getDateInWeek(int day, int month, int year) {

        if(!checkCorrectYear(year) || !checkCorrectMonth(month) || !checkCorrectDay(day)) {
            throw new RuntimeException("Invalid date");
        }

        int totalDay = 0;
        totalDay = (int) (year - 1 +((year - 1) / 4) - ((year - 1) / 100) + ((year - 1) / 400) + getDayFromStartYear(day , month, year));

        switch((int) (totalDay%7)) {
            case 1:
                return "Thu 2";
            case 2:
                return "Thu 3";
            case 3:
                return "Thu 4";
            case 4:
                return "Thu 5";
            case 5:
                return "Thu 6";
            case 6:
                return "Thu 7";
            default:
                return "Chu nhat";
        }
    }
}
