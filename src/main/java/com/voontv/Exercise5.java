package com.voontv;

public class Exercise5 {

    public int getMinCommonMultiplesInArray(int[] a) {
        int minCommon = a[0];

        for (int value : a) {
            int minCommonTemp = getMinCommonMultiples(minCommon, value);
            if (minCommonTemp >= minCommon) {
                minCommon = minCommonTemp;
            }
        }
        return minCommon;
    }

    public int getMaxCommonDivisor (int a, int b) {
        if (a == 0 || b == 0) {
            return Math.abs (a+b);
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

    public int getMinCommonMultiples (int a, int b) {
        return (a*b)/getMaxCommonDivisor (a,b);
    }
}
