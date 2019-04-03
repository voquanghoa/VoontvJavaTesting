package com.voontv;

public class Exercise1 {
    public boolean isCheckFirstRulesWithUsername (String username) {
        boolean check=true;

        for (int i=0; i < username.length(); i++){
            char c = username.charAt(i);
            if ((!Character.isDigit(c) && !Character.isLetter(c) && (c != '_')
                    && !isSpecialAcceptInUsername(c))) {
                return false;
            }

        }
        return check;
    }

    public boolean isCheckSecondRulesWithUsername (String username) {
        boolean check=true;

        for (int i = 0; i < username.length()-1; i++) {
            char c = username.charAt(i);
            char nextChar = username.charAt(i+1);
            if (isSpecialAcceptInUsername(c) && isSpecialAcceptInUsername(nextChar)) {
                return  false;
            }
        }
        return check;
    }

    public boolean isSpecialAcceptInUsername (char c) {

        return (c == '.') || (c == '-');
    }
}
