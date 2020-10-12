package com.company.LC316;

public class RemoveDuplicateLetters {
    public String removeDuplicateLetters(String s) {
        int len = s.length();
        if(len < 2)
            return s;
        StringBuilder result = new StringBuilder();
        int[] count = new int[26];
        for(int i = 0; i < len; i++) {
            count[s.charAt(i)-'a']++;
        }
        boolean[] visited = new boolean[26];
        for(int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            count[ch-'a']--;
            if(visited[ch-'a']) {
                continue;
            }
            while(result.length() > 0 && result.charAt(result.length()-1) > ch
                    && count[result.charAt(result.length()-1)-'a'] > 0) {
                visited[result.charAt(result.length()-1)-'a'] = false;
                result.deleteCharAt(result.length()-1);
            }
            result.append(ch);
            visited[ch-'a'] = true;
        }
        return result.toString();
    }
}
