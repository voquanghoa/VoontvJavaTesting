package com.voontv;

public class Exercise2 {

    public int getValueFiboInPosition (int n) {
        if( n == 1 || n ==2) {
            return 1;
        }
        return getValueFiboInPosition (n -1) + getValueFiboInPosition (n-2);
    }

    public int totalFiboInRangeLimit (int n) {
        int total = 0;

        for(int i=1; i<=n ; i++) {
            total += getValueFiboInPosition(i);
        }
        return total;
    }
}
