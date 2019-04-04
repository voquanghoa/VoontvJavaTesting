package com.voontv;

public class Exercise5 {

    public int getLowestCommonMultiples(int[] array) {
        int minCommon = array[0];

        for (int value : array) {
            minCommon = getLowestCommonMultiples(minCommon, value);
        }
        return minCommon;
    }

    public int getMaxCommonDivisors(int a, int b) {
        if (a == 0 || b == 0) {
            return Math.abs(a + b);
        }
        while (a != b) {
            if (a >= b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    public int getLowestCommonMultiples(int a, int b) {
        return (a * b)/getMaxCommonDivisors(a, b);
    }
}
