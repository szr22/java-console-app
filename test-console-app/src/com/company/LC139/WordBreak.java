package com.company.LC139;

import java.util.HashMap;
import java.util.List;

public class WordBreak {
    HashMap<Integer, Boolean> hashMap = new HashMap<>();
    public boolean wordBreak(String s, List<String> wordDict) {
        return traverse(s, wordDict, 0);
    }

    private boolean traverse(String s, List<String> wordDict, int pos){
        int len = s.length();
        StringBuilder stringBuilder = new StringBuilder();
        boolean flag = false;

        if(hashMap.containsKey(pos)) return hashMap.get(pos);

        for(int i=pos; i<len; i++){
            stringBuilder.append(s.charAt(i));
            if(wordDict.contains(stringBuilder.toString())) flag |= traverse(s, wordDict, i+1);
        }

        if(stringBuilder.toString().length()!=0 && !wordDict.contains(stringBuilder.toString()) && !flag){
            hashMap.put(pos, false);
            return false;
        }else{
            hashMap.put(pos, true);
            return true;
        }
    }
}
