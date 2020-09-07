package com.company.LC291;

import java.util.HashMap;
import java.util.Map;

public class WordPatternII {
    public boolean wordPattern(String pattern, String str) {
        HashMap<Character, String> map = new HashMap();
        return helper(pattern, 0, str, 0, map);
    }

    private boolean helper(String pattern, int idxP, String str, int idxS, HashMap<Character, String> map) {
        if(idxP==pattern.length() && idxS==str.length()) return true;
        if(idxP==pattern.length() || idxS==str.length()) return false;

        char ch = pattern.charAt(idxP);

        for (int i=idxS; i<str.length(); ++i){
            String subStr = str.substring(idxS, i+1);

            if(map.containsKey(ch) && map.get(ch).equals(subStr)){
                if(helper(pattern, idxP+1, str, i+1, map))
                    return true;
            }else if(!map.containsKey(ch)){
                boolean hasSubStr = false;
                for(Map.Entry entry : map.entrySet()){
                    if(entry.getValue()==subStr)
                        hasSubStr = true;
                }
                if(!hasSubStr){
                    map.put(ch, subStr);
                    if (helper(pattern, idxP+1, str, i+1, map))
                        return  true;
                    map.remove(ch);
                }
            }
        }

        return false;
    }
}
