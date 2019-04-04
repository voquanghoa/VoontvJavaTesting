package com.voontv;

public class Exercise3 {
    public String removesCharacterRedundancy (String string) {
        StringBuilder builder = new StringBuilder(string);

        for(int i = string.length() - 1; i > 0; i--) {
            char ch = string.charAt(i);
            char nextChar = string.charAt(i-1);
            if(ch == nextChar) {
                builder.deleteCharAt(i);
            }
        }
        return builder.toString();
    }
}
