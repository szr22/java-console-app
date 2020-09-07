package com.company.LC459;

public class RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String s) {
        if (s == null)
            return false;

        int n = s.length();
        for (int i=n/2; i>0; i--){
            if (n%i == 0){
               int j = 0;
               while(i + j < n && s.charAt(j) == s.charAt(j + i)){
                   j++;
               }
               if(i+j==n) return true;
            }
        }
        return false;
    }
}
