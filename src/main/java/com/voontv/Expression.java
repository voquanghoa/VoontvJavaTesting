package com.voontv;

public class Expression {

    public int add(int x, int y){
        return x + y;
    }

    public int subtract(int x, int y){
        return x - y;
    }

    public int divide(int x, int y){
        return x/y;
    }

    public int max(int x, int y, int z){
        if(x>y && x>z){
            return x;
        }

        if(y>z){
            return y;
        }
        return z;
    }
}
