package com.voontv;

public class Exercise7 {

    public boolean checkCharacterSameAs(String string1, String string2) {
        StringBuilder builder1 = new StringBuilder(string1.toLowerCase());
        StringBuilder builder2 = new StringBuilder(string2.toLowerCase());

        if(string1.length() != string2.length()) {
            return false;
        }

        for(int integer = 0; integer <builder1.length(); integer++) {
            for(int integer2 = 0; integer2<builder2.length(); integer2++) {
                if(builder1.charAt(integer) == builder2.charAt(integer2)) {
                    builder2.deleteCharAt(integer2);
                    break;
                }
            }
        }
        return builder2.toString().isEmpty();
    }
}
