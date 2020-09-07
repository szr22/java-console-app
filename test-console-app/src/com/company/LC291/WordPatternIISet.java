package com.company.LC291;

import java.util.HashMap;
import java.util.HashSet;

public class WordPatternIISet {
    public boolean wordPattern(String pattern, String str) {
        HashMap<Character, String> map = new HashMap();
        HashSet<String> set = new HashSet();
        return helper(pattern, 0, str, 0, map, set);
    }

    private boolean helper(String pattern, int idxP, String str, int idxS, HashMap<Character, String> map, HashSet<String> set) {
        if(idxP==pattern.length() && idxS==str.length()) return true;
        if(idxP==pattern.length() || idxS==str.length()) return false;

        char ch = pattern.charAt(idxP);

        for (int i=idxS; i<str.length(); i++){
            String subStr = str.substring(idxS, i+1);
            if(map.containsKey(ch) && map.get(ch).equals(subStr)) {
                if (helper(pattern, idxP + 1, str, i + 1, map, set))
                    return true;
            }else if (!map.containsKey(ch)) {
                if (set.contains(subStr)) continue;

                map.put(ch, subStr);
                set.add(subStr);
                if (helper(pattern, idxP + 1, str, i + 1, map, set)) return true;
                map.remove(ch);
                set.remove(subStr);
            }
        }

        return false;
    }
}
