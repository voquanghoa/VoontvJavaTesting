package com.voontv;

public class Exercise4 {

    public int totalChildArrayMax (int[] array) {
        int total = 0;
        int sumChildArray = 0;

        for (int value : array) {
            if (value >= 0) {
                sumChildArray += value;
            } else {
                if (total <= sumChildArray) {
                    total = sumChildArray;
                }
                sumChildArray = 0;
            }
        }
        return total;
    }
}
