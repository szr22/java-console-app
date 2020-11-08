package com.company.LC1446;

public class ConsecutiveCharacters {
    public int maxPower(String s) {
        int maxOrder = 1;
        int currOrder = 1;
        for(int i = 1; i < s.length(); ++i){
            currOrder =(s.charAt(i - 1) == s.charAt(i))? currOrder + 1: 1;
            maxOrder = Math.max(maxOrder, currOrder);
        }
        return maxOrder;
    }
}
