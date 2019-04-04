package com.voontv;

public class Exercise4 {

    public int totalChildArrayMaxInArray (int[] a) {
        int total = 0;
        int sumChildArray = 0;
        for (int value : a) {
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
