package com.voontv;

public class Exercise8 {

    public int totalDigitReverse(int[] array) {
        int total=0;

        for(int integer: array) {
            total += getDigitReverse(integer);
        }
        return total;
    }

    public int getDigitReverse(int number) {
        int reverse = 0;
        int count = 0;

        while(number > 0) {
            reverse = reverse * 10 + number % 10;
            number /= 10;
            count++;
        }
        return reverse;
    }
}
