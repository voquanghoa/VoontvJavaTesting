package com.voontv;

public class Exercise4 {

    public int totalChildArrayMaxInArray (int[] a) {
        int total = 0;
        int sumChildArray = 0;
        for(int i=0; i<a.length; i++){
            if (a[i] >=0) {
                sumChildArray += a[i];
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
