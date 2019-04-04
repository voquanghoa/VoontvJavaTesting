package com.voontv;

public class Exercise6 {

    public int getLargestCommonDivisor(int[] array) {
        int largest=0;

        for(int integer: array) {
            largest = getLargestCommonDivisor(largest, integer);
        }
        return largest;
    }

    public int getLargestCommonDivisor(int integerA, int integerB) {
        if(integerA == 0 || integerB == 0) {
            return Math.abs((int) (integerA + integerB));
        }

        while(integerA != integerB) {
            if(integerA >= integerB) {
                integerA -= integerB;
            } else {
                integerB -= integerA;
            }
        }
        return integerA;
    }

    public int getLowestCommonMultiples(int integerA, int integerB) {
        return (integerA * integerB)/getLargestCommonDivisor(integerA, integerB);
    }
}
