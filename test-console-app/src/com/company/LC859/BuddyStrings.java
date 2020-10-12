package com.company.LC859;

public class BuddyStrings {
    public boolean buddyStrings(String A, String B) {
        if (A.length() != B.length())  return false;

        if(A.equals(B)){
            int[] charCount = new int['z'+1];
            for(int i = A.length()-1; i>=0; i--){
                if(charCount[A.charAt(i)]++ > 0) return true;
            }
            return false;
        }

        char[] aChars = A.toCharArray();
        char[] bChars = B.toCharArray();
        int first = aChars.length - 1;
        while (first >= 0 && aChars[first] == bChars[first])  first--;

        int second = first - 1;
        while (second >= 0 && aChars[second] == bChars[second])  second--;
        if (second < 0 || aChars[first] != bChars[second] || aChars[second] != bChars[first])  return false;

        int rest = second - 1;
        while (rest >= 0 && aChars[rest] == bChars[rest])  rest--;
        return rest < 0;
    }
}
