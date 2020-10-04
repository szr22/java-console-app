package com.company.LC139;

import com.company.util.Trie;

import java.util.List;

public class WordBreakTrie {
    public boolean wordBreak(String s, List<String> wordDict) {
        if (wordDict == null || s== null||wordDict.size() ==0 || s.length() ==0){
            return false;
        }
        Trie trie = new Trie();
        int n = s.length();
        int[] canBreak = new int[n+1];
        for (String word:wordDict) {
            trie.insert(word);
        }
        return helper(s, trie, canBreak, 0);
    }

    private boolean helper(String s, Trie trie, int[] canBreak, int index){
        if (index == s.length()) {
            return true;
        }
        if (canBreak[index] == 1){
            return true;
        }
        if (canBreak[index] == 2) {
            return false;
        }
        int n = s.length();
        Trie.TrieNode node = trie.root;
        for (int i = index;i<n;i++) {
            int ii = s.charAt(i)-'a';
            if (node.next[ii] == null) {
                break;
            }
            node = node.next[ii];
            if (node.isWord) {
                if (helper(s, trie,canBreak, i+1)){
                    canBreak[index] = 1;
                    return true;
                }
            }

        }
        canBreak[index] = 2;
        return false;
    }
}
