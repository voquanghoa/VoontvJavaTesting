package com.voontv;

public class Exercise10 {

    public boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 ==0 && year % 100 != 0);
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

    public int countDayRemainning(int month, int year) {
        int countDay = 0;
        for(int i = 12; i >= month; i--) {
            countDay += getDay(i, year);
        }
        return countDay;
    }
}
