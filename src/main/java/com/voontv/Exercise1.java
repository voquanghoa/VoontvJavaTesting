package com.voontv;

public class Exercise1 {
    public boolean checkFirstRulesWithUsername(String username) {

        for (int i=0; i < username.length(); i++){
            char ch = username.charAt(i);
            if (!Character.isDigit(ch) && !Character.isLetter(ch) && (ch != '_')
                    && !isSpecialAcceptInUsername(ch)) {
                return false;
            }

        }
        return true;
    }

    public boolean checkSecondRulesWithUsername (String username) {

        for (int i = 0; i < username.length()-1; i++) {
            char ch = username.charAt(i);
            char nextChar = username.charAt(i + 1);
            if (isSpecialAcceptInUsername(ch) && isSpecialAcceptInUsername(nextChar)) {
                return  false;
            }
        }
        return true;
    }

    public boolean checkFistAndLastCharacter (String username) {
        char ch = username.charAt(0);
        char last = username.charAt(username.length() - 1);
        boolean checkFistChar;
        boolean checLastChar;

        if (Character.isDigit(ch) || Character.isLetter(ch) || (ch == '_')) {
            checkFistChar = true;
        } else {
            checkFistChar = false;
        }

        if (Character.isDigit(last) || Character.isLetter(last) || (last == '_')) {
            checLastChar = true;
        } else {
            checLastChar = false;
        }
        return (checkFistChar && checLastChar);
    }

    public boolean checkFirstRulesWithDomain (String domain) {

        for (int i=0; i<domain.length(); i++) {
            char ch = domain.charAt(i);
            if(!Character.isDigit(ch) && !Character.isLetter(ch) && (ch != '_') && (ch != '.')) {
                return false;
            }
        }
        return true;
    }

    public boolean countDotsInDomain (String domain) {
        int count = 0;

        for ( int i = 0; i<domain.length(); i++) {
            if (domain.charAt(i) == '.') {
                count++;
            }
        }
        return count <= 3 && count >= 1;
    }
    public boolean checkRulesPositionsDots (String domain) {

        for (int i=0; i<domain.length() - 1; i++) {
            char ch = domain.charAt(i);
            char nextChar = domain.charAt(i + 1);
            if ((ch == '.' && i == 0) || (i == domain.length() - 2 && nextChar == '.')
                    || (ch == nextChar && ch == '.')) {
                return false;
            }
        }
        return true;
    }

    public boolean isSpecialAcceptInUsername (char ch) {

        return (ch == '.') || (ch == '-');
    }
}
