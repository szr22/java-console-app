package com.company.LC115;

import java.util.*;

public class DistinctSubsequences {

    public int numDistinct(String s, String t) {
        Map<Character, Set<Integer>> map = new HashMap<>();
        for(int i=0;i<t.length();i++){
            Set<Integer> set = map.getOrDefault(t.charAt(i),new HashSet<>());
            set.add(i);
            map.put(t.charAt(i),set);
        }
        int[] a = new int[t.length()];
        for(char c: s.toCharArray()){
            if(map.containsKey(c)){
                int[] a1 = Arrays.copyOf(a, a.length);
                for(int i: map.get(c)){
                    a1[i] = i==0 ? a[i]+1 : a[i]+a[i-1];
                }
                a = a1;
            }
        }
        return a[t.length()-1];
    }
}
