package com.company.LC389;

import java.util.HashMap;
import java.util.Map;

public class FindTheDifferenceHashMap {
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (!map.containsKey(c) || map.get(c) == 0)
                return c;

            else {
                int curr = map.get(c) - 1;
                map.put(c, curr);
            }
        }
        char ans = ' ';
        return ans;
    }
}
