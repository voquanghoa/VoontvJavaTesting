package com.voontv;

public class Exercise1 {
    public boolean checkFirstRulesWithUsername (String username) {
        boolean check=true;

        for (int i=0; i < username.length(); i++){
            char c = username.charAt(i);
            if (!Character.isDigit(c) && !Character.isLetter(c) && (c != '_')
                    && !isSpecialAcceptInUsername(c)) {
                return false;
            }

        }
        return check;
    }

    public boolean checkSecondRulesWithUsername (String username) {
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

    public boolean checkFistAndLastCharacter (String username) {

        return (Character.isLowerCase (username.charAt(0)) && Character.isLowerCase(username.charAt(username.length()-1)));
    }

    public boolean checkFirstRulesWithDomain (String domain) {
        boolean check = true;

        for (int i=0; i<domain.length(); i++) {
            char c = domain.charAt(i);
            if(!Character.isDigit(c) && !Character.isLetter(c) && (c != '_') && (c != '.')) {
                return false;
            }
        }
        return check;
    }

    public boolean countDotsInDomain (String domain) {
        boolean check = true;
        int count = 0;

        for ( int i = 0; i<domain.length(); i++) {
            if (domain.charAt(i) == '.') {
                count++;
            }
        }
        if(count >3 || count <1) {
            return false;
        }
        return check;
    }
    public boolean checkRulesPositionsDots (String domain) {
        boolean check = true;

        for (int i=0; i<domain.length()-1; i++) {
            char c = domain.charAt(i);
            char nextChar = domain.charAt(i+1);
            if ((c == '.' && i == 0) || (i == domain.length()-2 && nextChar == '.')
                    || (c == nextChar && c == '.')) {
                return false;
            }
        }
        return check;
    }

    public boolean isSpecialAcceptInUsername (char c) {

        return (c == '.') || (c == '-');
    }
}
