package com.voontv;

public class Exercise3 {
    public String removesCharacterRedundancy (String string) {
        StringBuffer buffer = new StringBuffer(string);

        for (int i=string.length()-1; i >0; i--) {
            char c = string.charAt(i);
            char nextChar = string.charAt(i-1);
            if(c == nextChar) {
                buffer.deleteCharAt(i);
            }
        }
        return buffer.toString();
    }
}
