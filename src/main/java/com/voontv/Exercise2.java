package com.voontv;

public class Exercise2 {

    public int getValueFiboInPosition(int position) {
        if( position == 1 || position ==2) {
            return 1;
        }
        return getValueFiboInPosition(position - 1) + getValueFiboInPosition(position - 2);
    }

    public int totalFiboInRangeLimit(int position) {
        int total = 0;

        for(int i=1; i<=position ; i++) {
            total += getValueFiboInPosition(i);
        }
        return total;
    }
}
