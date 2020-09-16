package com.company.LC58;

public class LengthOfLastWordOther {
    public int lengthOfLastWord(String s) {
        int count = 0;
        int i = s.length()-1;
        while (i >= 0) {
            if (s.charAt(i) == ' ') {
                i--;
            } else {
                break;
            }
        }
        while (i >= 0 && s.charAt(i) != ' ') {
            count++;
            i--;
        }
        return count;
    }
}
