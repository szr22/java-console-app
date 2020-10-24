package com.company.LC187;

import java.util.ArrayList;
import java.util.List;

public class RepeatedDNASequencesBetter {
    private final static int[] map = new int[128];

    static {
        map['A'] = 0; map['C'] = 1; map['G'] = 2; map['T'] = 3;
    }

    public List<String> findRepeatedDnaSequences(String s) {
        List<String> ans = new ArrayList<>();
        if (s.length() < 10) return ans;
        char[] chars = s.toCharArray();
        boolean[] hashCodeMap = new boolean[1048576], added = new boolean[1048576];

        int hashCode = 0, i = 0;
        for (; i < 10; i++) {
            hashCode = (hashCode << 2) + map[chars[i]];
        }
        hashCodeMap[hashCode] = true;
        for (; i < chars.length; i++) {
            hashCode = ((hashCode << 2) & 0xFFFFF) + map[chars[i]];


            if (hashCodeMap[hashCode] && !added[hashCode]) {
                ans.add(new String(chars,i-9,10));
                added[hashCode] = true;
            }
            hashCodeMap[hashCode] = true;
        }

        return ans;
    }
}
